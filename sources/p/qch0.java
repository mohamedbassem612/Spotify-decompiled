package p;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qch0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public float N;
    public float O;
    public byte[] P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public long U;
    public long V;
    public bwg1 W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a;
    public boolean a0;
    public String b;
    public boolean b0;
    public String c;
    public String c0;
    public int d;
    public gtf1 d0;
    public long e;
    public ie30 e0;
    public int f;
    public int f0;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public byte[] k;
    public ftf1 l;
    public byte[] m;
    public x8v n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f119p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public float v;
    public float w;
    public float x;
    public byte[] y;
    public int z;

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public final byte[] a(String str) throws ParserException {
        byte[] bArr = this.m;
        if (bArr != null) {
            return bArr;
        }
        throw ParserException.a((RuntimeException) null, "Missing CodecPrivate for codec " + str);
    }
}
