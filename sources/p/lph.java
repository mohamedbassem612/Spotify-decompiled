package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.podcastinteractivity.commentssheetimpl.page.LaunchActionParams;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lph implements tmh {
    public final a1r0 a;
    public final th30 b;
    public final h21 c;
    public final Scheduler d;
    public final tjh e;
    public final fo4 f;

    public lph(a1r0 a1r0Var, th30 th30Var, h21 h21Var, Scheduler scheduler, tjh tjhVar, fo4 fo4Var) {
        this.a = a1r0Var;
        this.b = th30Var;
        this.c = h21Var;
        this.d = scheduler;
        this.e = tjhVar;
        this.f = fo4Var;
    }

    public static void c(lph lphVar, lik1 lik1Var, String str, boolean z, boolean z2, LaunchActionParams launchActionParams, tv80 tv80Var, int i) {
        String lastPathSegment;
        List<String> pathSegments;
        List<String> pathSegments2;
        String strZ;
        ou80 ou80Var;
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) != 0 ? false : z2;
        String str2 = null;
        LaunchActionParams launchActionParams2 = (i & 16) != 0 ? null : launchActionParams;
        tv80 tv80Var2 = (i & 32) != 0 ? null : tv80Var;
        lphVar.getClass();
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        if (s4b1VarX.c != blc0.SHOW_EPISODE) {
            return;
        }
        String strH = s4b1VarX.h();
        if ((launchActionParams2 instanceof LaunchActionParams.ShowSingleCommentThread) || (launchActionParams2 instanceof LaunchActionParams.ExpandThread) || (launchActionParams2 instanceof LaunchActionParams.ReplyToComment) || (launchActionParams2 instanceof LaunchActionParams.ShowContextMenu)) {
            s4b1 s4b1VarX2 = uic.x(launchActionParams2.getCommentUri());
            Uri uri = s4b1VarX2.a;
            switch (s4b1VarX2.c.ordinal()) {
                case 221:
                    lastPathSegment = (uri != null && (pathSegments = uri.getPathSegments()) != null) ? (String) o7h.t0(6, pathSegments) : null;
                    break;
                case 222:
                    lastPathSegment = uri == null ? null : uri.getLastPathSegment();
                    break;
                case 223:
                    lastPathSegment = (uri != null && (pathSegments2 = uri.getPathSegments()) != null) ? (String) o7h.t0(5, pathSegments2) : null;
                    break;
                default:
                    lastPathSegment = null;
                    break;
            }
            if (lastPathSegment == null) {
                return;
            } else {
                strZ = uic.o(strH, lastPathSegment).z();
            }
        } else {
            strZ = uic.m(strH).z();
        }
        String str3 = strZ;
        if (str3 == null) {
            return;
        }
        Bundle bundleH = mno1.h(new mmr0[]{oqn1.n("view_uri", lik1Var.a), oqn1.n("disable_input", Boolean.valueOf(z3)), oqn1.n("launch_action", launchActionParams2), oqn1.n("show_sensitive", Boolean.valueOf(z4))});
        a1r0 a1r0Var = lphVar.a;
        if (tv80Var2 != null && (ou80Var = tv80Var2.a) != null) {
            str2 = ou80Var.a;
        }
        a1r0.j(a1r0Var, str3, str2, bundleH, false, 8);
        lphVar.e.a(str, false).s(lphVar.d).subscribe(ps4.i, new f93(str, (byte) 3));
    }

    public final void b(String str, kph kphVar) {
        ((zf30) kphVar).s1.a(new i83(this.e.a(str, false).s(this.d).subscribe(ps4.i, new f93(str, (byte) 3)), (byte) 3));
    }
}
