package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class BeanSerializerBase extends StdSerializer<Object> {
    protected static final PropertyName NAME_FOR_OBJECT_REF = new PropertyName("#object-ref");
    protected static final BeanPropertyWriter[] NO_PROPS = new BeanPropertyWriter[0];
}
