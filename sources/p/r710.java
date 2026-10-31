package p;

import com.spotify.externalintegration.ubi.UbiSpecificationId;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class r710 {
    public final UbiSpecificationId a;
    public final String b;
    public final String c;
    public final Integer d;

    public r710(UbiSpecificationId ubiSpecificationId, String str, String str2, Integer num) {
        this.a = ubiSpecificationId;
        this.b = str;
        this.c = str2;
        this.d = num;
    }

    public final String a() {
        return this.c;
    }

    public final Integer b() {
        return this.d;
    }

    public final UbiSpecificationId c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r710)) {
            return false;
        }
        r710 r710Var = (r710) obj;
        return this.a == r710Var.a && u890.j(this.b, r710Var.b) && u890.j(this.c, r710Var.c) && u890.j(this.d, r710Var.d);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public /* synthetic */ r710(UbiSpecificationId ubiSpecificationId, String str, Integer num, int i) {
        this(ubiSpecificationId, str, (String) null, (i & 8) != 0 ? null : num);
    }
}
