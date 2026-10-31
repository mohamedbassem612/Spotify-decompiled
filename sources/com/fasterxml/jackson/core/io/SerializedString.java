package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.SerializableString;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import p.eg;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class SerializedString implements SerializableString, Serializable {
    private static final JsonStringEncoder JSON_ENCODER = JsonStringEncoder.getInstance();
    protected transient String _jdkSerializeValue;
    protected final String _value;

    public SerializedString(String str) {
        if (str != null) {
            this._value = str;
        } else {
            eg.m("Null String illegal for SerializedString");
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this._jdkSerializeValue = objectInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeUTF(this._value);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this._value.equals(((SerializedString) obj)._value);
    }

    public final int hashCode() {
        return this._value.hashCode();
    }

    public Object readResolve() {
        return new SerializedString(this._jdkSerializeValue);
    }

    public final String toString() {
        return this._value;
    }
}
