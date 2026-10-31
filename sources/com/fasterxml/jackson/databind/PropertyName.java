package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class PropertyName implements Serializable {
    protected final String _namespace;
    protected final String _simpleName;
    public static final PropertyName USE_DEFAULT = new PropertyName("", null);
    public static final PropertyName NO_NAME = new PropertyName(new String(""), null);

    public PropertyName(String str, String str2) {
        this._simpleName = ClassUtil.nonNullString(str);
        this._namespace = str2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        PropertyName propertyName = (PropertyName) obj;
        String str = this._simpleName;
        String str2 = propertyName._simpleName;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        String str3 = this._namespace;
        String str4 = propertyName._namespace;
        if (str3 == null) {
            return str4 == null;
        }
        return str3.equals(str4);
    }

    public int hashCode() {
        String str = this._namespace;
        if (str == null) {
            return this._simpleName.hashCode();
        }
        return this._simpleName.hashCode() ^ str.hashCode();
    }

    public Object readResolve() {
        if (this._namespace != null) {
            return this;
        }
        String str = this._simpleName;
        return (str == null || "".equals(str)) ? USE_DEFAULT : this;
    }

    public String toString() {
        if (this._namespace == null) {
            return this._simpleName;
        }
        return "{" + this._namespace + "}" + this._simpleName;
    }

    public PropertyName(String str) {
        this(str, null);
    }
}
