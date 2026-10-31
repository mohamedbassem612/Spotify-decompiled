package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum tnw0 {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");

    public final ajn0 a;
    public final ajn0 b;
    public final znb0 c = dm5.S(2, new b9o(this, (byte) 10));
    public final znb0 d = dm5.S(2, new jqb0(this, (byte) 11));
    public static final Set e = dm61.z0(CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE);

    tnw0(String str) {
        this.a = ajn0.e(str);
        this.b = ajn0.e(str.concat("Array"));
    }
}
