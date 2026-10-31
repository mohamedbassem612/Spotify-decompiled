package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cky {
    public final lky a;
    public final aky b;
    public final fky c;
    public final kky d;
    public final bs51 e;
    public final wiy f;
    public final ziy g;
    public final bky h;
    public final int i;
    public final piy j;
    public final mjy k;
    public final ojy l;
    public final int m;
    public final cjy n;
    public final idd1 o;

    public /* synthetic */ cky(lky lkyVar, aky akyVar, fky fkyVar, kky kkyVar, bs51 bs51Var, wiy wiyVar, bky bkyVar, piy piyVar, cjy cjyVar, int i) {
        this(lkyVar, akyVar, (i & 4) != 0 ? null : fkyVar, kkyVar, (i & 16) != 0 ? null : bs51Var, (i & 32) != 0 ? null : wiyVar, null, (i & 128) != 0 ? null : bkyVar, 4, (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : piyVar, null, null, 3, (i & 8192) != 0 ? ajy.a : cjyVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cky)) {
            return false;
        }
        cky ckyVar = (cky) obj;
        return u890.j(this.a, ckyVar.a) && u890.j(this.b, ckyVar.b) && u890.j(this.c, ckyVar.c) && u890.j(this.d, ckyVar.d) && u890.j(this.e, ckyVar.e) && u890.j(this.f, ckyVar.f) && u890.j(this.g, ckyVar.g) && u890.j(this.h, ckyVar.h) && this.i == ckyVar.i && u890.j(this.j, ckyVar.j) && u890.j(this.k, ckyVar.k) && u890.j(this.l, ckyVar.l) && this.m == ckyVar.m && u890.j(this.n, ckyVar.n);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        aky akyVar = this.b;
        int iHashCode2 = (iHashCode + (akyVar == null ? 0 : akyVar.hashCode())) * 31;
        fky fkyVar = this.c;
        int iHashCode3 = (iHashCode2 + (fkyVar == null ? 0 : fkyVar.hashCode())) * 31;
        kky kkyVar = this.d;
        int iHashCode4 = (iHashCode3 + (kkyVar == null ? 0 : kkyVar.hashCode())) * 31;
        bs51 bs51Var = this.e;
        int iHashCode5 = (iHashCode4 + (bs51Var == null ? 0 : bs51Var.hashCode())) * 31;
        wiy wiyVar = this.f;
        int iHashCode6 = (iHashCode5 + (wiyVar == null ? 0 : wiyVar.hashCode())) * 31;
        ziy ziyVar = this.g;
        int iHashCode7 = (iHashCode6 + (ziyVar == null ? 0 : ziyVar.hashCode())) * 31;
        bky bkyVar = this.h;
        int iK = ab80.k(this.i, (iHashCode7 + (bkyVar == null ? 0 : bkyVar.hashCode())) * 31, 31);
        piy piyVar = this.j;
        int iHashCode8 = (iK + (piyVar == null ? 0 : piyVar.hashCode())) * 31;
        mjy mjyVar = this.k;
        int iHashCode9 = (iHashCode8 + (mjyVar == null ? 0 : mjyVar.hashCode())) * 31;
        ojy ojyVar = this.l;
        return this.n.hashCode() + ab80.k(this.m, (iHashCode9 + (ojyVar != null ? ojyVar.hashCode() : 0)) * 31, 31);
    }

    public cky(lky lkyVar, aky akyVar, fky fkyVar, kky kkyVar, bs51 bs51Var, wiy wiyVar, ziy ziyVar, bky bkyVar, int i, piy piyVar, mjy mjyVar, ojy ojyVar, int i2, cjy cjyVar) {
        this.a = lkyVar;
        this.b = akyVar;
        this.c = fkyVar;
        this.d = kkyVar;
        this.e = bs51Var;
        this.f = wiyVar;
        this.g = ziyVar;
        this.h = bkyVar;
        this.i = i;
        this.j = piyVar;
        this.k = mjyVar;
        this.l = ojyVar;
        this.m = i2;
        this.n = cjyVar;
        this.o = new idd1(new pdy(this, (byte) 2));
    }
}
