package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class alp0 {
    public final List a;
    public final d2l b;
    public final l0l c;
    public final gbl d;
    public final gbl e;
    public final boolean f;
    public final String g;
    public final l0l h;
    public final boolean i;
    public final boolean j;

    public alp0(List list, d2l d2lVar, l0l l0lVar, gbl gblVar, gbl gblVar2, boolean z, String str, l0l l0lVar2, boolean z2, boolean z3) {
        this.a = list;
        this.b = d2lVar;
        this.c = l0lVar;
        this.d = gblVar;
        this.e = gblVar2;
        this.f = z;
        this.g = str;
        this.h = l0lVar2;
        this.i = z2;
        this.j = z3;
    }

    public static alp0 a(alp0 alp0Var, List list, d2l d2lVar, l0l l0lVar, gbl gblVar, gbl gblVar2, boolean z, String str, l0l l0lVar2, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = alp0Var.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            d2lVar = alp0Var.b;
        }
        d2l d2lVar2 = d2lVar;
        if ((i & 4) != 0) {
            l0lVar = alp0Var.c;
        }
        l0l l0lVar3 = l0lVar;
        if ((i & 8) != 0) {
            gblVar = alp0Var.d;
        }
        return new alp0(list2, d2lVar2, l0lVar3, gblVar, (i & 16) != 0 ? alp0Var.e : gblVar2, (i & 32) != 0 ? alp0Var.f : z, (i & 64) != 0 ? alp0Var.g : str, (i & 128) != 0 ? alp0Var.h : l0lVar2, alp0Var.i, (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? alp0Var.j : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alp0)) {
            return false;
        }
        alp0 alp0Var = (alp0) obj;
        return u890.j(this.a, alp0Var.a) && u890.j(this.b, alp0Var.b) && u890.j(this.c, alp0Var.c) && this.d == alp0Var.d && this.e == alp0Var.e && this.f == alp0Var.f && u890.j(this.g, alp0Var.g) && u890.j(this.h, alp0Var.h) && this.i == alp0Var.i && this.j == alp0Var.j;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        d2l d2lVar = this.b;
        int iHashCode2 = (iHashCode + (d2lVar == null ? 0 : d2lVar.hashCode())) * 31;
        l0l l0lVar = this.c;
        int iG = xcg1.g((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (l0lVar == null ? 0 : l0lVar.hashCode())) * 31)) * 31)) * 31, 31, this.f);
        String str = this.g;
        int iHashCode3 = (iG + (str == null ? 0 : str.hashCode())) * 31;
        l0l l0lVar2 = this.h;
        return Boolean.hashCode(this.j) + xcg1.g((iHashCode3 + (l0lVar2 != null ? l0lVar2.hashCode() : 0)) * 31, 31, this.i);
    }
}
