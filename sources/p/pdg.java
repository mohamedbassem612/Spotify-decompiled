package p;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.TextView;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pdg implements o4h1 {
    public final lzn0 a;
    public final cfd b;
    public final aod c;
    public final iyc0 d;
    public final op31 e;
    public final mdg f;
    public final ddg g;
    public final vdg h;
    public final llm i;
    public xab1 j;

    public pdg(lzn0 lzn0Var, cfd cfdVar, aod aodVar, iyc0 iyc0Var, op31 op31Var, mdg mdgVar, q8n q8nVar, ddg ddgVar, vdg vdgVar) {
        int i;
        int i2;
        int i3;
        this.a = lzn0Var;
        this.b = cfdVar;
        this.c = aodVar;
        this.d = iyc0Var;
        this.e = op31Var;
        this.f = mdgVar;
        this.g = ddgVar;
        this.h = vdgVar;
        this.i = smo1.e(q8nVar);
        vdgVar.e = new syf(this, (byte) 7);
        vdgVar.c.d(true);
        ArtworkView artworkView = vdgVar.t;
        String str = ddgVar.c;
        boolean z = ddgVar.d;
        TextView textView = vdgVar.i;
        Context context = vdgVar.b;
        if (z) {
            i = 2131959972;
        } else {
            if (z) {
                eg.o();
                throw null;
            }
            i = 2131959973;
        }
        textView.setText(context.getString(i, ddgVar.a));
        TextView textView2 = vdgVar.X;
        if (z) {
            i2 = 2131959967;
        } else {
            if (z) {
                eg.o();
                throw null;
            }
            i2 = 2131959968;
        }
        String str2 = ddgVar.b.h;
        String string = context.getString(i2, "UNIQUE_PLACEHOLDER_STRING");
        int iW0 = ihc1.w0(string, "UNIQUE_PLACEHOLDER_STRING", 0, false, 6);
        SpannableString spannableString = new SpannableString(nhc1.W(string, "UNIQUE_PLACEHOLDER_STRING", str2));
        spannableString.setSpan(new StyleSpan(1), iW0, str2.length() + iW0, 17);
        textView2.setText(spannableString);
        TextView textView3 = vdgVar.Y;
        if (z) {
            i3 = 2131959965;
        } else {
            if (z) {
                eg.o();
                throw null;
            }
            i3 = 2131959966;
        }
        textView3.setText(i3);
        if (str == null || str.length() == 0) {
            artworkView.setVisibility(8);
            vdgVar.Z.setVisibility(8);
            vdgVar.d.setBackground(vdgVar.g);
        } else {
            artworkView.setViewContext(new f47(vdgVar.a));
            artworkView.n(new syf(vdgVar, (byte) 9));
            artworkView.h(new y07(new g07(str), true));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r10.c(r9, r0) == r8) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof p.ndg
            if (r0 == 0) goto L13
            r0 = r10
            p.ndg r0 = (p.ndg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.ndg r0 = new p.ndg
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.a
            int r1 = r0.c
            r2 = 30000(0x7530, double:1.4822E-319)
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            p.d9n r8 = p.d9n.a
            if (r1 == 0) goto L3e
            if (r1 == r6) goto L3a
            if (r1 == r5) goto L36
            if (r1 != r4) goto L30
            p.hm5.M(r10)     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e
            goto L79
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r7
        L36:
            p.hm5.M(r10)     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            goto L63
        L3a:
            p.hm5.M(r10)     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            goto L50
        L3e:
            p.hm5.M(r10)
            p.odg r10 = new p.odg     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            r1 = 0
            r10.<init>(r9, r7, r1)     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            r0.c = r6     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            java.lang.Object r10 = p.rc2.M(r2, r10, r0)     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            if (r10 != r8) goto L50
            goto L78
        L50:
            p.py21 r10 = (p.py21) r10     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            r10.d()     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            p.odg r10 = new p.odg     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            r10.<init>(r9, r7, r6)     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            r0.c = r5     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            java.lang.Object r10 = p.rc2.M(r2, r10, r0)     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            if (r10 != r8) goto L63
            goto L78
        L63:
            p.py21 r10 = (p.py21) r10     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            r10.d()     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            p.op31 r10 = r9.e     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            p.mdg r9 = r9.f     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            java.lang.String r9 = r9.a     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            r0.c = r4     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            p.pp31 r10 = (p.pp31) r10     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            java.lang.Object r9 = r10.c(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            if (r9 != r8) goto L79
        L78:
            return r8
        L79:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE     // Catch: java.util.concurrent.CancellationException -> L7c java.lang.Throwable -> L7e java.lang.Throwable -> L7e
            return r9
        L7c:
            r9 = move-exception
            throw r9
        L7e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pdg.a(p.onm):java.lang.Object");
    }

    public final void stop() {
        xab1 xab1Var = this.j;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.j = null;
    }

    public final void start() {
    }
}
