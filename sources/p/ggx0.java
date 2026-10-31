package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.geometry.Offset;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class ggx0 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggx0(sbz0 sbz0Var, byte b) {
        super(0, sbz0Var, sbz0.class, "scheduleAutoDismissIfNeeded", "scheduleAutoDismissIfNeeded()V", 0);
        this.a = b;
        switch (b) {
            case 6:
                super(0, sbz0Var, sbz0.class, "cancelAutoDismiss", "cancelAutoDismiss()V", 0);
                break;
            case 7:
                super(0, sbz0Var, sbz0.class, "cancelAutoDismiss", "cancelAutoDismiss()V", 0);
                break;
            case 8:
                super(0, sbz0Var, sbz0.class, "expandInitialPeekIfNeeded", "expandInitialPeekIfNeeded()V", 0);
                break;
            default:
                break;
        }
    }

    public final Object invoke() {
        Object value;
        Single singleCache;
        switch (this.a) {
            case 0:
                ((su01) ((lyc) this).receiver).f("decorate_episode_and_audiobook_progress");
                return rih1.a;
            case 1:
                return ((pk00) ((lyc) this).receiver).a();
            case 2:
                return ((pk00) ((lyc) this).receiver).a();
            case 3:
                c7y0 c7y0Var = (c7y0) ((lyc) this).receiver;
                c7y0Var.getClass();
                return new mx2(c7y0Var);
            case 4:
                i4z0 i4z0Var = (i4z0) ((lyc) this).receiver;
                bpb1 bpb1Var = i4z0Var.t;
                String string = ihc1.e1(((o4z0) bpb1Var.getValue()).c).toString();
                if (string.length() != 0 && !((o4z0) bpb1Var.getValue()).d) {
                    hyy0 hyy0Var = i4z0Var.g;
                    String str = i4z0Var.d.c;
                    int i = ((o4z0) bpb1Var.getValue()).a;
                    i8h1 i8h1Var = (i8h1) ((ykq) hyy0Var.b).get();
                    h7l0 h7l0Var = (h7l0) hyy0Var.c;
                    Integer numValueOf = Integer.valueOf(i);
                    r6h1 r6h1VarB = h7l0Var.b();
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-genpods-onboarding-question";
                    x6h1VarI.f = "1.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.b = str;
                    x6h1VarI.c = numValueOf;
                    x6h1 x6h1VarC = x6h1VarI.a().c();
                    x6h1VarC.i.add(new a7h1("custom_answer_composer", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("submit_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    b7x b7xVar = b7x.a;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA, r6h1VarB, System.currentTimeMillis()), (xj61) null);
                    do {
                        value = bpb1Var.getValue();
                    } while (!bpb1Var.k(value, o4z0.a((o4z0) value, null, null, true, 7)));
                    fn31.T(i4z0Var.h, (o8n) null, 0, new glu0((byte) 18, i4z0Var, string, (lnm) null), 3);
                }
                return rih1.a;
            case 5:
                sbz0 sbz0Var = (sbz0) ((lyc) this).receiver;
                pe peVar = sbz0Var.f;
                if (sbz0Var.j && sbz0Var.d() && !sbz0Var.e.l() && !peVar.e()) {
                    sbz0Var.c();
                    sbz0Var.p = fn31.T(sbz0Var.o, (o8n) null, 0, new kv2(peVar.d() ? (long) peVar.c() : 0L, sbz0Var, (lnm) null, (byte) 11), 3);
                }
                return rih1.a;
            case 6:
                ((sbz0) ((lyc) this).receiver).c();
                return rih1.a;
            case 7:
                ((sbz0) ((lyc) this).receiver).c();
                return rih1.a;
            case 8:
                sbz0 sbz0Var2 = (sbz0) ((lyc) this).receiver;
                if (sbz0Var2.d() && sbz0Var2.j && sbz0Var2.a.getResources().getConfiguration().orientation != 2) {
                    sbz0Var2.c();
                    BottomSheetBehavior bottomSheetBehavior = sbz0Var2.q;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.L(6);
                    }
                }
                return rih1.a;
            case 9:
                ((su01) ((lyc) this).receiver).f("decorate_reactions");
                return rih1.a;
            case 10:
                ((su01) ((lyc) this).receiver).f("decorate_share_profiles");
                return rih1.a;
            case 11:
                g711 g711Var = (g711) ((lyc) this).receiver;
                g711Var.a++;
                if (!g711Var.b) {
                    g711Var.b = true;
                    g711Var.c.o0(g711Var);
                    g711Var.d.invoke();
                }
                return rih1.a;
            case 12:
                g711 g711Var2 = (g711) ((lyc) this).receiver;
                int i2 = g711Var2.a - 1;
                g711Var2.a = i2;
                if (i2 == 0) {
                    g711Var2.e.invoke();
                }
                return rih1.a;
            case 13:
                g711 g711Var3 = (g711) ((lyc) this).receiver;
                g711Var3.a++;
                if (!g711Var3.b) {
                    g711Var3.b = true;
                    g711Var3.c.o0(g711Var3);
                    g711Var3.d.invoke();
                }
                return rih1.a;
            case 14:
                g711 g711Var4 = (g711) ((lyc) this).receiver;
                int i3 = g711Var4.a - 1;
                g711Var4.a = i3;
                if (i3 == 0) {
                    g711Var4.e.invoke();
                }
                return rih1.a;
            case 15:
                ((oa11) ((lyc) this).receiver).f();
                return rih1.a;
            case 16:
                u721 u721Var = (u721) ((lyc) this).receiver;
                View view = u721Var.c;
                if (view != null) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                }
                u721Var.c = null;
                return rih1.a;
            case 17:
                e631 e631Var = (e631) ((lyc) this).receiver;
                Activity activity = e631Var.a;
                Uri uriB = e631Var.b.b();
                if (uriB == null) {
                    uriB = Uri.parse("https://play.google.com/store/apps/details?id=com.spotify.music");
                }
                Intent intent = new Intent("android.intent.action.VIEW", uriB);
                if (intent.resolveActivity(activity.getPackageManager()) != null) {
                    activity.startActivity(intent);
                } else {
                    z710.d(e631Var.c, "https://play.google.com/store/apps/details?id=com.spotify.music", false, 6);
                }
                return rih1.a;
            case 18:
                ((lzn0) ((lyc) this).receiver).e();
                return rih1.a;
            case 19:
                yjs yjsVar = (yjs) ((lyc) this).receiver;
                uxy0 uxy0Var = yjsVar.c;
                i8h1 i8h1Var2 = (i8h1) ((uyp) uxy0Var.b).get();
                x6h1 x6h1VarC3 = ((brl0) uxy0Var.c).b.c();
                x6h1VarC3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                b7x b7xVar2 = b7x.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar2), new x7h1("ui_navigate_back", 1, b7xVar2), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                yjsVar.b.invoke(c531.a);
                return rih1.a;
            case 20:
                mt41 mt41Var = (mt41) ((lyc) this).receiver;
                mma0[] mma0VarArr = mt41.h;
                mt41Var.a();
                return rih1.a;
            case 21:
                ((ViewGroup) ((lyc) this).receiver).postInvalidateOnAnimation();
                return rih1.a;
            case 22:
                ((ViewGroup) ((lyc) this).receiver).postInvalidateOnAnimation();
                return rih1.a;
            case 23:
                gq51 gq51Var = (gq51) ((lyc) this).receiver;
                synchronized (gq51Var) {
                    singleCache = gq51Var.j;
                    if (singleCache == null) {
                        singleCache = gq51Var.b().cache();
                        gq51Var.j = singleCache;
                    }
                    break;
                }
                return singleCache;
            case 24:
                hd61 hd61Var = (hd61) ((lyc) this).receiver;
                vi8 vi8Var = hd61Var.e;
                if (vi8Var != null) {
                    Disposable disposable = vi8Var.e;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    ram0 ram0Var = vi8Var.d;
                    if (ram0Var != null) {
                        ram0Var.dispose();
                    }
                }
                it8 it8Var = hd61Var.d;
                if (it8Var != null) {
                    ((rku) it8Var.c).a();
                }
                return rih1.a;
            case 25:
                z871 z871Var = (z871) ((lyc) this).receiver;
                i8h1 i8h1Var3 = (i8h1) z871Var.a.get();
                x6h1 x6h1VarC4 = z871Var.c.b.c();
                x6h1VarC4.i.add(new a7h1("copy_link_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                y6h1 y6h1VarA3 = x6h1VarC4.a();
                b7x b7xVar3 = b7x.a;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar3), new x7h1("copy_to_clipboard", 1, b7xVar3), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1.a;
            case 26:
                return ((pk00) ((lyc) this).receiver).a();
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                kt91 kt91Var = ((cn91) ((lyc) this).receiver).b.a;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131963921});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", 2131963921, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1.a;
            case 28:
                ev91 ev91Var = (ev91) ((lyc) this).receiver;
                ev91Var.V0 = false;
                g8n g8nVar = ev91Var.S0;
                long j = ((Offset) ev91Var.U0.e()).a;
                g8nVar.getClass();
                Iterator it = f8n.f.iterator();
                if (!it.hasNext()) {
                    hhg1.k();
                    return null;
                }
                Object next = it.next();
                if (it.hasNext()) {
                    float fE = Offset.e(Offset.f(j, g8nVar.b((f8n) next)));
                    do {
                        Object next2 = it.next();
                        float fE2 = Offset.e(Offset.f(j, g8nVar.b((f8n) next2)));
                        if (Float.compare(fE, fE2) > 0) {
                            next = next2;
                            fE = fE2;
                        }
                    } while (it.hasNext());
                }
                f8n f8nVar = (f8n) next;
                ev91Var.Q0 = f8nVar;
                ev91Var.R0.invoke(f8nVar);
                ev91Var.K1(false);
                return rih1.a;
            default:
                ev91 ev91Var2 = (ev91) ((lyc) this).receiver;
                ev91Var2.V0 = false;
                if (((pim0) ev91Var2).N0) {
                    ev91Var2.K1(false);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ggx0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggx0(g711 g711Var, byte b) {
        super(0, g711Var, g711.class, "viewDrawingStarted", "viewDrawingStarted()V", 0);
        this.a = b;
        switch (b) {
            case 12:
                super(0, g711Var, g711.class, "viewDrawingFinished", "viewDrawingFinished()V", 0);
                break;
            case 13:
                super(0, g711Var, g711.class, "viewDrawingStarted", "viewDrawingStarted()V", 0);
                break;
            case 14:
                super(0, g711Var, g711.class, "viewDrawingFinished", "viewDrawingFinished()V", 0);
                break;
            default:
                break;
        }
    }
}
