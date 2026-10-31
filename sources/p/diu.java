package p;

import com.spotify.adsinternal.adscore.model.Format;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class diu implements fq0 {
    public final fq0 a;
    public final String b;
    public final biu c;
    public final ciu d;
    public final List e;
    public final String f;
    public final Format g;
    public final String h;
    public final String i;

    public diu(fq0 fq0Var, String str, biu biuVar, ciu ciuVar, List list, String str2, Format format, String str3, String str4) {
        this.a = fq0Var;
        this.b = str;
        this.c = biuVar;
        this.d = ciuVar;
        this.e = list;
        this.f = str2;
        this.g = format;
        this.h = str3;
        this.i = str4;
    }

    public final String a() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diu)) {
            return false;
        }
        diu diuVar = (diu) obj;
        return this.a.equals(diuVar.a) && u890.j(this.b, diuVar.b) && this.c.equals(diuVar.c) && this.d.equals(diuVar.d) && u890.j(this.e, diuVar.e) && u890.j(this.f, diuVar.f) && this.g == diuVar.g && u890.j(this.h, diuVar.h) && u890.j(this.i, diuVar.i);
    }

    public final String h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.i.hashCode() + cy30.d((this.g.hashCode() + cy30.d(f4i1.b((this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f)) * 31, 31, this.h);
    }

    public final String k() {
        return this.a.k();
    }
}
