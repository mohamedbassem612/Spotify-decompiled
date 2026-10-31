package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g4i1 {
    public final bb61 a;
    public final i4i1 b;
    public final i29 c;
    public final List d;
    public boolean e = false;
    public boolean f = false;

    public g4i1(bb61 bb61Var, i4i1 i4i1Var, i29 i29Var, List list) {
        this.a = bb61Var;
        this.b = i4i1Var;
        this.c = i29Var;
        this.d = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
        sb.append(this.a);
        sb.append(", mUseCaseConfig=");
        sb.append(this.b);
        sb.append(", mStreamSpec=");
        sb.append(this.c);
        sb.append(", mCaptureTypes=");
        sb.append(this.d);
        sb.append(", mAttached=");
        sb.append(this.e);
        sb.append(", mActive=");
        return f4i1.g(sb, this.f, '}');
    }
}
