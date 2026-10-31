package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class w281 implements ez00 {
    public final e6p1 a;
    public final e6p1 b;
    public final boolean c;
    public final List d;
    public final List e;
    public final j281 f;
    public final u281 g;
    public final q281 h;
    public final t281 i;
    public final byte[] j;
    public final r281 k;
    public final boolean l;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ w281(e6p1 e6p1Var, k281 k281Var, boolean z, ArrayList arrayList, ArrayList arrayList2, u281 u281Var, q281 q281Var, t281 t281Var, byte[] bArr, r281 r281Var, boolean z2, int i) {
        e6p1 e6p1Var2 = (i & 1) != 0 ? null : e6p1Var;
        k281 k281Var2 = (i & 2) != 0 ? null : k281Var;
        boolean z3 = (i & 4) != 0 ? false : z;
        int i2 = i & 8;
        ArrayList arrayList3 = z6x.a;
        this(e6p1Var2, (e6p1) k281Var2, z3, (List) (i2 != 0 ? arrayList3 : arrayList), (List) ((i & 16) != 0 ? arrayList3 : arrayList2), (j281) null, (i & 64) != 0 ? null : u281Var, (i & 128) != 0 ? null : q281Var, (i & 256) != 0 ? null : t281Var, (i & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : bArr, (i & 1024) != 0 ? null : r281Var, (i & 2048) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w281)) {
            return false;
        }
        w281 w281Var = (w281) obj;
        return u890.j(this.a, w281Var.a) && u890.j(this.b, w281Var.b) && this.c == w281Var.c && u890.j(this.d, w281Var.d) && u890.j(this.e, w281Var.e) && u890.j(this.f, w281Var.f) && u890.j(this.g, w281Var.g) && u890.j(this.h, w281Var.h) && u890.j(this.i, w281Var.i) && u890.j(this.j, w281Var.j) && u890.j(this.k, w281Var.k) && this.l == w281Var.l;
    }

    public final int hashCode() {
        e6p1 e6p1Var = this.a;
        int iHashCode = (e6p1Var == null ? 0 : e6p1Var.hashCode()) * 31;
        e6p1 e6p1Var2 = this.b;
        int iB = f4i1.b(f4i1.b(xcg1.g((iHashCode + (e6p1Var2 == null ? 0 : e6p1Var2.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        j281 j281Var = this.f;
        int iHashCode2 = (iB + (j281Var == null ? 0 : j281Var.hashCode())) * 31;
        u281 u281Var = this.g;
        int iHashCode3 = (iHashCode2 + (u281Var == null ? 0 : u281Var.hashCode())) * 31;
        q281 q281Var = this.h;
        int iHashCode4 = (iHashCode3 + (q281Var == null ? 0 : q281Var.hashCode())) * 31;
        t281 t281Var = this.i;
        int iHashCode5 = (iHashCode4 + (t281Var == null ? 0 : t281Var.hashCode())) * 31;
        byte[] bArr = this.j;
        int iHashCode6 = (iHashCode5 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        r281 r281Var = this.k;
        return Boolean.hashCode(this.l) + ((iHashCode6 + (r281Var != null ? r281Var.hashCode() : 0)) * 31);
    }

    public w281(e6p1 e6p1Var, e6p1 e6p1Var2, boolean z, List list, List list2, j281 j281Var, u281 u281Var, q281 q281Var, t281 t281Var, byte[] bArr, r281 r281Var, boolean z2) {
        this.a = e6p1Var;
        this.b = e6p1Var2;
        this.c = z;
        this.d = list;
        this.e = list2;
        this.f = j281Var;
        this.g = u281Var;
        this.h = q281Var;
        this.i = t281Var;
        this.j = bArr;
        this.k = r281Var;
        this.l = z2;
    }
}
