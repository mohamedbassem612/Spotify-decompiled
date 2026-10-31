package p;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.support.v4.os.ResultReceiver;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import com.spotify.widget.widget.widgetimpl.SpotifyWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hw9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public hw9(hod0 hod0Var, d4e0 d4e0Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = (byte) 12;
        this.d = hod0Var;
        this.e = d4e0Var;
        this.b = bundle;
        this.c = resultReceiver;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        n5b1 n5b1VarD;
        vsr0 vsr0Var;
        String str;
        vtn1 vtn1VarQ;
        int i = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.d;
                try {
                    ((SpotifyWidget) this.e).b((Context) this.b, (Intent) this.c);
                    if (pendingResult != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                }
            case 1:
                BroadcastReceiver.PendingResult pendingResult2 = (BroadcastReceiver.PendingResult) this.d;
                try {
                    ((jw9) this.e).a((Context) this.b, (Intent) this.c);
                    if (pendingResult2 != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (pendingResult2 != null) {
                        pendingResult2.finish();
                    }
                }
            case 2:
                if (((gag) this.e).n) {
                    return;
                }
                ((WebView) this.b).evaluateJavascript(cy30.p("window._genUiResolve && window._genUiResolve('", (String) this.c, "', ", (String) this.d, ")"), null);
                return;
            case 3:
                if (((wtg) this.e).Y || !((wtg) this.e).f.containsKey((String) this.b)) {
                    return;
                }
                lag lagVar = ((wtg) this.e).e;
                String str2 = (String) this.b;
                String[] strArr = (String[]) this.c;
                int[] iArr = (int[]) this.d;
                jtg jtgVar = (jtg) lagVar.b;
                tr80 tr80VarQ = yoi1.Q(0, Math.min(strArr.length, iArr.length));
                ArrayList arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
                lr80 it = tr80VarQ.iterator();
                while (((sr80) it).c) {
                    int iNextInt = it.nextInt();
                    int i2 = iArr[iNextInt];
                    arrayList.add(new ktg(strArr[iNextInt], (i2 & 1) != 0, (i2 & 2) != 0, (i2 & 4) != 0));
                }
                gtg gtgVar = (gtg) jtgVar.d.a.getValue();
                itg itgVar = (itg) jtgVar.b.get(str2);
                if (itgVar != null) {
                    itgVar.a = arrayList;
                    if (u890.j(((gtg) jtgVar.a.getValue()).a, str2)) {
                        jtgVar.a(str2);
                    }
                }
                gtg gtgVar2 = (gtg) jtgVar.d.a.getValue();
                if (u890.j(gtgVar2, gtgVar)) {
                    return;
                }
                ((ftg) lagVar.c).a(gtgVar2);
                return;
            case 4:
                ux70 ux70Var = ((ser) this.e).b;
                Activity activity = (Activity) this.b;
                a1r0 a1r0Var = (a1r0) ux70Var.invoke(activity);
                a1r0Var.f((dwn0) this.c, (Bundle) this.d, a1r0Var.h(activity));
                return;
            case 5:
                wjr wjrVar = (wjr) this.b;
                wjrVar.d.invoke();
                akr akrVar = (akr) this.c;
                nxb nxbVarA = akrVar.f().a();
                if ((nxbVarA != null ? nxbVarA.d : 0) == 2) {
                    ((ujr) this.d).setBackgroundColorImmediately(akrVar.a.getColor(R.color.transparent));
                }
                akrVar.n = wjrVar.c;
                akrVar.q = true;
                nxb nxbVarA2 = akrVar.f().a();
                viewGroup = nxbVarA2 != null ? nxbVarA2.b : null;
                if (viewGroup != ixb.c) {
                    akrVar.l(viewGroup != null ? akrVar.m(viewGroup) : 3);
                    return;
                }
                return;
            case 6:
                n811 n811Var = (n811) this.e;
                ver verVar = (ver) this.b;
                n811Var.a = verVar.k(5);
                n811 n811Var2 = (n811) this.c;
                f0a f0aVar = (f0a) verVar.b;
                RecyclerView recyclerView = (RecyclerView) f0aVar.h;
                int childCount = recyclerView.getChildCount();
                int measuredHeight = 0;
                while (i < childCount) {
                    View childAt = recyclerView.getChildAt(i);
                    if (childAt != null) {
                        measuredHeight = childAt.getMeasuredHeight() + measuredHeight;
                    }
                    i++;
                }
                n811Var2.a = measuredHeight;
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) this.d;
                layoutParams.height = n811Var.a;
                ((RecyclerView) f0aVar.h).setLayoutParams(layoutParams);
                return;
            case 7:
                ((p4t) this.e).d((String) this.b, (String) this.c, (nx2) this.d);
                return;
            case 8:
                mfm.c(((i4q) ((st60) this.e).b).a((lik1) this.b), (kjm) this.c, (p6r0) null, new bjm(6, ((xz80) this.d).a, (String) null), (tv80) null, 18);
                return;
            case 9:
                ViewGroup viewGroup2 = (ViewGroup) ((iu30) this.e).invoke(((u1g0) this.b).b.e);
                ViewParent parent = viewGroup2.getParent();
                viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(viewGroup2);
                }
                viewGroup2.setLayoutParams((ViewGroup.LayoutParams) this.c);
                viewGroup2.setVisibility(0);
                ((y1g0) this.d).addView(viewGroup2);
                return;
            case 10:
                IBinder binder = ((Messenger) ((d4e0) this.e).b).getBinder();
                SpotifyMediaBrowserService spotifyMediaBrowserService = (jih0) ((hod0) this.d).b;
                zhh0 zhh0Var = (zhh0) ((jih0) spotifyMediaBrowserService).d.get(binder);
                if (zhh0Var == null) {
                    return;
                }
                HashMap map = zhh0Var.e;
                String str3 = (String) this.b;
                IBinder iBinder = (IBinder) this.c;
                try {
                    if (iBinder == null) {
                        map.remove(str3);
                        n5b1VarD = spotifyMediaBrowserService.d();
                        vsr0Var = new vsr0(str3);
                    } else {
                        List list = (List) map.get(str3);
                        if (list != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                if (iBinder == ((nmr0) it2.next()).a) {
                                    it2.remove();
                                }
                            }
                            if (list.size() == 0) {
                                map.remove(str3);
                            }
                        }
                        n5b1VarD = spotifyMediaBrowserService.d();
                        vsr0Var = new vsr0(str3);
                    }
                    n5b1VarD.m(vsr0Var);
                    return;
                } catch (Throwable th) {
                    spotifyMediaBrowserService.d().m(new vsr0(str3));
                    throw th;
                }
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (((zhh0) ((jih0) ((hod0) this.d).b).d.get(((Messenger) ((d4e0) this.e).b).getBinder())) == null) {
                    return;
                }
                String str4 = (String) this.b;
                yhh0 yhh0Var = new yhh0(str4, (ResultReceiver) this.c, (byte) 0);
                ((gih0) yhh0Var).d = (byte) 2;
                yhh0Var.d((ArrayList) null);
                if (yhh0Var.b()) {
                    return;
                }
                eg.m(l1d.m("onLoadItem must call detach() or sendResult() before returning for id=", str4));
                return;
            case grn1.d /* 12 */:
                Bundle bundle = (Bundle) this.b;
                if (((zhh0) ((jih0) ((hod0) this.d).b).d.get(((Messenger) ((d4e0) this.e).b).getBinder())) == null) {
                    Objects.toString(bundle);
                    return;
                } else {
                    ((ResultReceiver) this.c).send(-1, (Bundle) null);
                    return;
                }
            case 13:
                a1r0.j(((t001) this.e).a, (String) this.b, (String) null, mno1.h(new mmr0[]{new mmr0("parent_entity_uri", (String) this.c), new mmr0("entity_id", (String) this.d)}), true, 2);
                return;
            case 14:
                r001 r001Var = (r001) this.e;
                th30 th30Var = ((t001) this.b).b;
                String str5 = (String) this.c;
                r001Var.g2 = (String) this.d;
                r001Var.f2 = str5;
                r001Var.g1(th30Var, "reactions-bottom-sheet-fragment");
                return;
            case 15:
                ((il91) this.b).t.onNext(new hk91(((rig) this.e).b, (String) this.c, (li91) this.d));
                return;
            case 16:
                irl1.i((View) this.e, (mrl1) this.b, (frl1) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case 17:
                iu30 onVideoSurfaceReady = ((fem1) this.e).getOnVideoSurfaceReady();
                if (onVideoSurfaceReady != null) {
                    onVideoSurfaceReady.invoke((Surface) this.b);
                }
                Surface surface = (Surface) this.c;
                if (surface != null) {
                    surface.release();
                }
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    return;
                }
                return;
            default:
                ecp1 ecp1Var = (ecp1) this.e;
                jcp1 jcp1Var = (jcp1) this.b;
                r0p1 r0p1Var = (r0p1) this.c;
                String str6 = (String) this.d;
                ikj1 ikj1Var = (ikj1) jcp1Var.b;
                ikj1Var.b = r0p1Var;
                j9p1 j9p1Var = (j9p1) ikj1Var.a;
                if (j9p1Var != null) {
                    str = j9p1Var.d;
                    if (upo1.K(str)) {
                        str = "NA";
                    } else {
                        zod.s(str);
                    }
                } else {
                    str = "NA";
                }
                bz11 bz11Var = new bz11();
                bz11Var.a = ecp1Var.a;
                bz11Var.b = ecp1Var.b;
                synchronized (ecp1.class) {
                    try {
                        vtn1VarQ = ecp1.k;
                        if (vtn1VarQ == null) {
                            fhe0 fhe0VarA = yoi1.A(Resources.getSystem().getConfiguration());
                            Object[] objArrCopyOf = new Object[4];
                            int i3 = 0;
                            while (i < fhe0VarA.c()) {
                                Locale localeB = fhe0VarA.b(i);
                                xot xotVar = dth.a;
                                String languageTag = localeB.toLanguageTag();
                                languageTag.getClass();
                                int i4 = i3 + 1;
                                int length = objArrCopyOf.length;
                                if (length < i4) {
                                    int i5 = length + (length >> 1) + 1;
                                    if (i5 < i4) {
                                        int iHighestOneBit = Integer.highestOneBit(i3);
                                        i5 = iHighestOneBit + iHighestOneBit;
                                    }
                                    if (i5 < 0) {
                                        i5 = Integer.MAX_VALUE;
                                    }
                                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
                                }
                                objArrCopyOf[i3] = languageTag;
                                i++;
                                i3 = i4;
                            }
                            vtn1VarQ = rqn1.q(i3, objArrCopyOf);
                            ecp1.k = vtn1VarQ;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                bz11Var.e = vtn1VarQ;
                bz11Var.h = Boolean.TRUE;
                bz11Var.d = str;
                bz11Var.c = str6;
                bz11Var.f = ecp1Var.f.j() ? (String) ecp1Var.f.g() : ecp1Var.d.a();
                bz11Var.j = 10;
                bz11Var.k = Integer.valueOf(ecp1Var.h);
                jcp1Var.c = bz11Var;
                ecp1Var.c.a(jcp1Var);
                return;
        }
    }

    public /* synthetic */ hw9(hod0 hod0Var, d4e0 d4e0Var, String str, Object obj, byte b) {
        this.a = b;
        this.d = hod0Var;
        this.e = d4e0Var;
        this.b = str;
        this.c = obj;
    }

    public /* synthetic */ hw9(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
