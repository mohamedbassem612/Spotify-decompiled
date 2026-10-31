package p;

import com.spotify.musicvideos.musicvideowidget.proto.v1.NpvWidgetResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hcn0 {
    public final NpvWidgetResponse a;
    public final boolean b;
    public final String c;
    public final String d;

    public hcn0(NpvWidgetResponse npvWidgetResponse, boolean z, String str, String str2) {
        this.a = npvWidgetResponse;
        this.b = z;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcn0)) {
            return false;
        }
        hcn0 hcn0Var = (hcn0) obj;
        return this.a.equals(hcn0Var.a) && this.b == hcn0Var.b && this.c.equals(hcn0Var.c) && this.d.equals(hcn0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(xcg1.g(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
