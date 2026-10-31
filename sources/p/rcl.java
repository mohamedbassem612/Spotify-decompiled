package p;

import android.content.ClipData;
import android.graphics.Point;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import java.util.function.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rcl implements cul, eul {
    public final /* synthetic */ byte a;
    public Object b;

    public rcl(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                this.b = v8r.q(Boolean.FALSE);
                break;
            default:
                this.b = LogSessionId.LOG_SESSION_ID_NONE;
                break;
        }
    }

    public void a(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    public Uri b() {
        return ((ContentInfo) this.b).getLinkUri();
    }

    public ful build() {
        return new ful(new rcl(((ContentInfo.Builder) this.b).build()));
    }

    public void c(ClipData clipData) {
        ((ContentInfo.Builder) this.b).setClip(clipData);
    }

    public ContentInfo d() {
        return (ContentInfo) this.b;
    }

    public ClipData e() {
        return ((ContentInfo) this.b).getClip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        if (r10.hasCapability(11) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p.gbl f(android.net.NetworkCapabilities r10) {
        /*
            r9 = this;
            if (r10 != 0) goto L4
            goto L96
        L4:
            r0 = 12
            boolean r0 = r10.hasCapability(r0)
            r1 = 13
            boolean r1 = r10.hasCapability(r1)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            r4 = 0
            r5 = 1
            if (r2 < r3) goto L2b
            int[] r2 = r10.getCapabilities()
            int r3 = r2.length
            r6 = r4
        L1e:
            if (r6 >= r3) goto L2b
            r7 = r2[r6]
            r8 = 22
            if (r7 != r8) goto L28
            r2 = r5
            goto L2c
        L28:
            int r6 = r6 + 1
            goto L1e
        L2b:
            r2 = r4
        L2c:
            r3 = 16
            boolean r3 = r10.hasCapability(r3)
            java.lang.Object r9 = r9.b
            p.m980 r9 = (p.m980) r9
            boolean r9 = r9.b
            if (r9 == 0) goto L42
            boolean r9 = r10.hasTransport(r4)
            if (r9 == 0) goto L42
            r9 = r5
            goto L43
        L42:
            r9 = r4
        L43:
            if (r0 == 0) goto L96
            if (r1 != 0) goto L49
            if (r2 == 0) goto L96
        L49:
            if (r3 != 0) goto L4d
            if (r9 == 0) goto L96
        L4d:
            r9 = 3
            boolean r9 = r10.hasTransport(r9)
            if (r9 == 0) goto L57
            p.gbl r9 = p.gbl.Y
            return r9
        L57:
            boolean r9 = r10.hasTransport(r5)
            if (r9 == 0) goto L5e
            goto L6f
        L5e:
            r9 = 2
            boolean r9 = r10.hasTransport(r9)
            p.gbl r0 = p.gbl.i
            if (r9 == 0) goto L72
            r9 = 11
            boolean r9 = r10.hasCapability(r9)
            if (r9 == 0) goto L87
        L6f:
            p.gbl r9 = p.gbl.X
            return r9
        L72:
            boolean r9 = r10.hasTransport(r4)
            if (r9 == 0) goto L92
            int r9 = r10.getLinkDownstreamBandwidthKbps()
            r10 = 10000(0x2710, float:1.4013E-41)
            if (r9 <= r10) goto L83
            p.gbl r9 = p.gbl.t
            return r9
        L83:
            r10 = 100
            if (r9 <= r10) goto L88
        L87:
            return r0
        L88:
            r10 = 50
            if (r9 <= r10) goto L8f
            p.gbl r9 = p.gbl.h
            return r9
        L8f:
            p.gbl r9 = p.gbl.g
            return r9
        L92:
            r10.toString()
            return r0
        L96:
            p.gbl r9 = p.gbl.f
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.rcl.f(android.net.NetworkCapabilities):p.gbl");
    }

    public boolean g() {
        return ((Boolean) ((hrr0) this.b).getValue()).booleanValue();
    }

    public Bundle getExtras() {
        return ((ContentInfo) this.b).getExtras();
    }

    public int getFlags() {
        return ((ContentInfo) this.b).getFlags();
    }

    public int getSource() {
        return ((ContentInfo) this.b).getSource();
    }

    public void h(ha4 ha4Var, y161 y161Var, o8n o8nVar, Consumer consumer) {
        bfn0 bfn0Var = new bfn0(0, new wq41[16]);
        eqn1.P(y161Var.a(), 0, new kmy(1, bfn0Var, bfn0.class, "add", "add(Ljava/lang/Object;)Z", 8, (byte) 2));
        f46.G0(bfn0Var.a, pap1.s(new iu30[]{new cix0((byte) 9), new cix0((byte) 10)}), bfn0Var.c);
        int i = bfn0Var.c;
        wq41 wq41Var = (wq41) (i == 0 ? null : bfn0Var.a[i - 1]);
        if (wq41Var == null) {
            return;
        }
        ur80 ur80Var = wq41Var.c;
        xxj xxjVar = new xxj(wq41Var.a, ur80Var, smo1.e(o8nVar), this, ha4Var);
        n511 n511VarM = nho1.m(wq41Var.d);
        long jC = ur80Var.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(ha4Var, l0p1.t(hm5.H(n511VarM)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), xxjVar);
        scrollCaptureTarget.setScrollBounds(l0p1.t(ur80Var));
        consumer.accept(scrollCaptureTarget);
    }

    public void i(LogSessionId logSessionId) {
        dm5.y(((LogSessionId) this.b).equals(LogSessionId.LOG_SESSION_ID_NONE));
        this.b = logSessionId;
    }

    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public void setFlags(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public rcl(m980 m980Var) {
        this.a = (byte) 0;
        this.b = m980Var;
    }

    public rcl(ContentInfo contentInfo) {
        this.a = (byte) 2;
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public rcl(ClipData clipData, int i) {
        this.a = (byte) 1;
        this.b = lb4.b(clipData, i);
    }

    public rcl(ful fulVar) {
        this.a = (byte) 1;
        lb4.e();
        this.b = lb4.c(fulVar.c());
    }
}
