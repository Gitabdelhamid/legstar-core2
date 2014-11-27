package com.legstar.converter.type.composite;

import java.util.Map;

import com.legstar.converter.type.CobolType;
import com.legstar.converter.visitor.CobolVisitor;

/**
 * A COBOl Group item.
 * 
 */
public class CobolComplexType extends CobolCompositeType {

    /**
     * List of fields mapping to their COBOL type.
     */
    private final Map < String, CobolType > fields;

    public CobolComplexType(Map < String, CobolType > children) {
        this.fields = children;
    }

    public Map < String, CobolType > getFields() {
        return fields;
    }

    /** {@inheritDoc} */
    public void accept(CobolVisitor visitor) {
        visitor.visit(this);
    }

}
