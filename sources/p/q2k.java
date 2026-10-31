package p;

import android.graphics.ComposeShader;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q2k extends zv61 {
    public final zv61 d;
    public final zv61 e;

    public q2k(zv61 zv61Var, zv61 zv61Var2) {
        this.d = zv61Var;
        this.e = zv61Var2;
    }

    public final Shader c(long j) {
        Shader shaderC = this.d.c(j);
        Shader shaderC2 = this.e.c(j);
        return Build.VERSION.SDK_INT >= 29 ? i15.b(shaderC, shaderC2, x74.v0(5)) : new ComposeShader(shaderC, shaderC2, x74.w0(5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2k)) {
            return false;
        }
        q2k q2kVar = (q2k) obj;
        return this.d.equals(q2kVar.d) && this.e.equals(q2kVar.e);
    }

    public final int hashCode() {
        return Integer.hashCode(5) + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String strQ = jm5.q(5);
        StringBuilder sb = new StringBuilder("CompositeShaderBrush(dstBrush=");
        sb.append(this.d);
        sb.append(", srcBrush=");
        sb.append(this.e);
        sb.append(", blendMode=");
        return l1d.n(strQ, ")", sb);
    }
}
