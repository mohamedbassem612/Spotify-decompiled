package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class s411 {
    public static final r411 Companion = new r411();
    public static final znb0[] g = {null, null, dm5.S(2, ijz0.S0), dm5.S(2, ijz0.T0), null, null};
    public final String a;
    public final int b;
    public final Set c;
    public final Set d;
    public final String e;
    public final boolean f;

    public /* synthetic */ s411(int i, String str, int i2, Set set, Set set2, String str2, boolean z) {
        if (2 != (i & 2)) {
            o6p1.t(i, 2, q411.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = i2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = set;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = set2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = true;
        } else {
            this.f = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s411)) {
            return false;
        }
        s411 s411Var = (s411) obj;
        return u890.j(this.a, s411Var.a) && this.b == s411Var.b && u890.j(this.c, s411Var.c) && u890.j(this.d, s411Var.d) && u890.j(this.e, s411Var.e) && this.f == s411Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int iF = kaa0.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Set set = this.c;
        int iHashCode = (iF + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.d;
        int iHashCode2 = (iHashCode + (set2 == null ? 0 : set2.hashCode())) * 31;
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public s411(int i, String str, String str2, Set set, Set set2) {
        this.a = str;
        this.b = i;
        this.c = set;
        this.d = set2;
        this.e = str2;
        this.f = true;
    }
}
