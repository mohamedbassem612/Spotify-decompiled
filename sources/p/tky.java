package p;

import com.spotify.campfire.chatcontentpickerpage.search.domain.EntityType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tky {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final EntityType f;
    public final int g;
    public final int h;
    public final int i;
    public final qtt0 j;

    public tky(String str, String str2, String str3, String str4, String str5, EntityType entityType, int i, int i2, int i3, qtt0 qtt0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = entityType;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = qtt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tky)) {
            return false;
        }
        tky tkyVar = (tky) obj;
        return u890.j(this.a, tkyVar.a) && u890.j(this.b, tkyVar.b) && this.c.equals(tkyVar.c) && this.d.equals(tkyVar.d) && u890.j(this.e, tkyVar.e) && this.f == tkyVar.f && this.g == tkyVar.g && this.h == tkyVar.h && this.i == tkyVar.i && this.j == tkyVar.j;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return this.j.hashCode() + ab80.k(this.i, ab80.k(this.h, kaa0.f(this.g, (this.f.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31), 31);
    }
}
