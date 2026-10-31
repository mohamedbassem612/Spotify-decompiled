package p;

import androidx.car.app.model.SectionHeader;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class utj {
    public final int a;
    public final r6h1 b;
    public final xu30 c;
    public final b8p1 d;
    public final Function0 e;
    public final SectionHeader f;

    public utj(int i, r6h1 r6h1Var, xu30 xu30Var, b8p1 b8p1Var, k7a1 k7a1Var, SectionHeader sectionHeader) {
        this.a = i;
        this.b = r6h1Var;
        this.c = xu30Var;
        this.d = b8p1Var;
        this.e = k7a1Var;
        this.f = sectionHeader;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utj)) {
            return false;
        }
        utj utjVar = (utj) obj;
        return this.a == utjVar.a && u890.j(this.b, utjVar.b) && this.c.equals(utjVar.c) && u890.j(this.d, utjVar.d) && u890.j(this.e, utjVar.e) && u890.j(this.f, utjVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31;
        b8p1 b8p1Var = this.d;
        int iHashCode2 = (iHashCode + (b8p1Var == null ? 0 : b8p1Var.hashCode())) * 31;
        Function0 function0 = this.e;
        int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
        SectionHeader sectionHeader = this.f;
        return iHashCode3 + (sectionHeader != null ? sectionHeader.hashCode() : 0);
    }
}
