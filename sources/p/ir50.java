package p;

import android.util.SparseArray;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ir50 {
    public final gtf1 a;
    public final boolean b;
    public final boolean c;
    public final k4w f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f73p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public hr50 m = new hr50();
    public hr50 n = new hr50();

    public ir50(gtf1 gtf1Var, boolean z, boolean z2) {
        this.a = gtf1Var;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[SemanticState.Focused];
        this.g = bArr;
        this.f = new k4w(bArr, 0, 0);
        this.k = false;
        this.o = false;
        hr50 hr50Var = this.n;
        hr50Var.b = false;
        hr50Var.a = false;
    }
}
