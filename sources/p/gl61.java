package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import com.spotify.base.java.logging.Logger;
import com.spotify.culturalmoments.stories.v1.FullscreenVideoStory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gl61 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gl61(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ysi0 string;
        byte b = this.a;
        d991 d991Var = d991.c;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                ohd ohdVar = (ohd) obj;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(Boolean.TRUE);
                    return;
                }
                return;
            case 1:
                ((iu30) ((b14) obj).b).invoke(ap61.b);
                return;
            case 2:
                ia91 ia91Var = (ia91) obj;
                n381 n381Var = ia91Var.W1;
                if (n381Var == null) {
                    u890.C("logger");
                    throw null;
                }
                tv80 tv80VarJ = n381Var.j();
                y991 y991Var = ia91Var.X1;
                if (y991Var == null) {
                    u890.C("navigator");
                    throw null;
                }
                Bundle bundle = ((zf30) ia91Var).f;
                string = bundle != null ? bundle.getString("ARGUMENT_URI") : null;
                if (string == null) {
                    string = "";
                }
                y991Var.a(string, d991Var, tv80VarJ);
                ia91Var.dismiss();
                return;
            case 3:
                q1t q1tVar = (q1t) obj;
                ((y991) q1tVar.d).a((String) q1tVar.e, d991Var, ((n381) q1tVar.c).j());
                return;
            case 4:
                ((nxr) obj).invoke();
                return;
            case 5:
                ((fva1) obj).Z0(false, false);
                return;
            case 6:
                ((zuc1) obj).dismiss();
                return;
            case 7:
                oyd1 oyd1Var = (oyd1) obj;
                ck20 ck20Var = oyd1Var.d2;
                if (ck20Var != null) {
                    ck20Var.c.take(1L).flatMapCompletable(bk20.b).subscribe(new ruz0(oyd1Var, (byte) 19));
                    return;
                } else {
                    u890.C("firstCommentFlowRepository");
                    throw null;
                }
            case 8:
                ((kgr) ((qxx0) obj).f).invoke();
                return;
            case 9:
                ((iu30) ((vh) obj).b).invoke(vde1.a);
                return;
            case 10:
                ((hx4) ((lvc1) obj).c).invoke();
                return;
            case 11:
                w1f1 w1f1Var = ((Toolbar) obj).p1;
                string = w1f1Var != null ? w1f1Var.b : null;
                if (string != null) {
                    string.collapseActionView();
                    return;
                }
                return;
            case 12:
                uaq0 uaq0Var = ((eg1) obj).b;
                if (uaq0Var != null) {
                    uaq0Var.d("spotify:aaa:con:t");
                    return;
                }
                return;
            case 13:
                TrackSelectionView trackSelectionView = (TrackSelectionView) obj;
                int i = TrackSelectionView.P0;
                HashMap map = trackSelectionView.g;
                if (view == trackSelectionView.c) {
                    trackSelectionView.O0 = true;
                    map.clear();
                } else if (view == trackSelectionView.d) {
                    trackSelectionView.O0 = false;
                    map.clear();
                } else {
                    trackSelectionView.O0 = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    l0g1 l0g1Var = (l0g1) tag;
                    n3g1 n3g1Var = l0g1Var.a;
                    pnf1 pnf1Var = n3g1Var.b;
                    int i2 = l0g1Var.b;
                    h0g1 h0g1Var = (h0g1) map.get(pnf1Var);
                    if (h0g1Var == null) {
                        if (!trackSelectionView.i && !map.isEmpty()) {
                            map.clear();
                        }
                        map.put(pnf1Var, new h0g1(pnf1Var, b380.t(Integer.valueOf(i2))));
                    } else {
                        ArrayList arrayList = new ArrayList((Collection) h0g1Var.b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z2 = trackSelectionView.h && n3g1Var.c;
                        if (!z2 && (!trackSelectionView.i || trackSelectionView.f.size() <= 1)) {
                            z = false;
                        }
                        if (zIsChecked && z) {
                            arrayList.remove(Integer.valueOf(i2));
                            if (arrayList.isEmpty()) {
                                map.remove(pnf1Var);
                            } else {
                                map.put(pnf1Var, new h0g1(pnf1Var, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z2) {
                                arrayList.add(Integer.valueOf(i2));
                                map.put(pnf1Var, new h0g1(pnf1Var, arrayList));
                            } else {
                                map.put(pnf1Var, new h0g1(pnf1Var, b380.t(Integer.valueOf(i2))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                return;
            case 14:
                try {
                    view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) obj)).addFlags(268435456));
                    return;
                } catch (Exception e) {
                    Logger.e(e, "Failed to open JIRA ticket link", new Object[0]);
                    return;
                }
            case 15:
                ((gdv) obj).invoke(view);
                return;
            case 16:
                zrj1 zrj1Var = (zrj1) obj;
                ((dzp0) zrj1Var.b).c((String) zrj1Var.c).a().l();
                r2a1 r2a1Var = (r2a1) zrj1Var.d;
                yt91 yt91Var = ((g8c1) r2a1Var.b).d;
                String strR = ((FullscreenVideoStory) r2a1Var.c).n().r();
                i8h1 i8h1Var = (i8h1) yt91Var.b;
                x6h1 x6h1VarC = ((yok0) yt91Var.d).b.c();
                x6h1VarC.i.add(new a7h1("story_container", strR, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("video_error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return;
            case 17:
                ((y2l1) obj).c();
                return;
            default:
                view.setEnabled(false);
                ijl1 ijl1Var = (ijl1) obj;
                ijl1Var.j1();
                int i3 = hjl1.a[ijl1Var.a1().ordinal()];
                if (i3 == 1) {
                    ijl1Var.S1.onNext(Boolean.TRUE);
                    ijl1Var.F1.postDelayed(ijl1Var.L1, 3100L);
                    ijl1Var.Y0(fjl1.b);
                    ijl1Var.c1();
                    return;
                }
                if (i3 == 2) {
                    WebView webView = ijl1Var.H1;
                    if (webView != null) {
                        webView.reload();
                        return;
                    }
                    return;
                }
                if (i3 != 3 && i3 != 4) {
                    eg.o();
                    return;
                }
                Logger.k("Reload button clicked with incompatible state: " + ijl1Var.a1(), new Object[0]);
                return;
        }
    }
}
