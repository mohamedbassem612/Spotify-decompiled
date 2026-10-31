package p;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.FacebookException;
import com.spotify.encoreconsumermobile.elements.camerabutton.CameraButtonView;
import com.spotify.encoreconsumermobile.elements.contextmenu.ContextMenuButton;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import com.spotify.legacyglue.widgetstate.StateListAnimatorImageButton;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lc20 implements Function, ObservableOnSubscribe, n5r, epi1, cy81, nzc {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;

    public lc20(abm abmVar, kmj1 kmj1Var) {
        this.a = (byte) 9;
        this.b = abmVar;
        this.c = kmj1Var;
        ppa0 ppa0Var = lo70.a;
        ppa0 ppa0VarB = ppa0Var.b(ppa0Var);
        jd11 jd11Var = rc11.a;
        this.d = new o3r(p7h.M(new l4r[]{new l4r(new xv00(jd11Var.b(l1z.class)), 3, t840.d, new j4r(r640.N0), t840.O0), new l4r(new xv00(jd11Var.b(jo70.class)), 3, t840.Q0, new j4r(r640.O0), t840.R0), new l4r(new wlu(jd11Var.b(hzy.class)), 3, t840.S0, new k4r(r640.P0, ppa0Var), t840.T0), new l4r(new wlu(jd11Var.b(jo70.class)), 2, r640.V0, new k4r(r640.Q0, ppa0Var), r640.W0), new l4r(new xv00(jd11Var.b(xkk1.class)), 3, t840.U0, new j4r(r640.R0), t840.V0), new l4r(hvm.d, 3, t840.W0, new j4r(r640.S0), r640.X0), new l4r(new xv00(jd11Var.b(z1g1.class)), 3, r640.Y0, new j4r(r640.T0), r640.Z0), new l4r(new xv00(jd11Var.b(gh3.class)), 3, r640.a1, new j4r(r640.U0), r640.b1), new l4r(new xv00(jd11Var.b(bql.class)), 3, r640.c1, new j4r(new s840(this, (byte) 2)), r640.d1), new l4r(new xv00(jd11Var.b(w281.class)), 3, r640.e1, new j4r(r640.h), t840.b), new l4r(new xv00(jd11Var.b(sdy.class)), 3, t840.c, new j4r(r640.i), t840.e), new l4r(new xv00(jd11Var.b(w281.class)), 3, t840.f, new k4r(r640.t, ppa0VarB), t840.g), new l4r(new xv00(jd11Var.b(sdy.class)), 3, t840.h, new k4r(r640.X, ppa0VarB), t840.i), new l4r(jd0.i, 3, t840.t, new j4r(r640.Y), t840.X), new l4r(v061.d, 3, t840.Y, new j4r(r640.Z), t840.Z), new l4r(pwc0.b, 3, t840.N0, new j4r(new s840(this, (byte) 0)), t840.P0)}), new s840(this, (byte) 1), false);
    }

    public static /* bridge */ /* synthetic */ Scroller a(lc20 lc20Var) {
        return (Scroller) lc20Var.c;
    }

    public static lc20 g(View view) {
        int i = 2131428234;
        ContextMenuButton contextMenuButtonT = m5n1.t(view, 2131428234);
        if (contextMenuButtonT != null) {
            i = 2131429099;
            TextView textView = (TextView) m5n1.t(view, 2131429099);
            if (textView != null) {
                return new lc20(view, (Object) contextMenuButtonT, (Object) textView, (byte) 11);
            }
        }
        bhn0.i("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v14 java.lang.Object, still in use, count: 2, list:
          (r4v14 java.lang.Object) from 0x0047: PHI (r4 I:??) = (r4v11 java.lang.Object), (r4v14 java.lang.Object) binds: [B:17:0x0046, B:49:0x0047] A[DONT_GENERATE, DONT_INLINE]
          (r4v14 java.lang.Object) from 0x0035: CHECK_CAST (p.uuy0) (r4v14 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object apply(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.lc20.apply(java.lang.Object):java.lang.Object");
    }

    public Object attachCompleter(mzc mzcVar) {
        mzcVar.a(new a6n(this, (byte) 28), n5u.a());
        ((is50) this.d).a.set(mzcVar);
        return "HandlerScheduledFuture-" + ((Callable) this.c).toString();
    }

    public void b(JSONObject jSONObject) {
        String string;
        Bundle bundle = (Bundle) this.b;
        rq40 rq40Var = (rq40) this.c;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e) {
                tye0 tye0VarH = rq40Var.h();
                rye0 rye0Var = rq40Var.h().g;
                String message = e.getMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Caught exception");
                if (message != null) {
                    arrayList.add(message);
                }
                tye0VarH.g(new sye0(rye0Var, 3, (xd) null, (rl8) null, TextUtils.join(": ", arrayList), (String) null));
                return;
            }
        } else {
            string = null;
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        rq40Var.x(bundle, (rye0) this.d);
    }

    public String c(Long l, yqg yqgVar, Context context) {
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        Calendar calendarD = yqgVar.d();
        Calendar calendar = (Calendar) calendarD.clone();
        calendar.setTimeInMillis(jLongValue);
        if (calendar.get(0) == calendarD.get(0) && calendar.get(1) == calendarD.get(1) && calendar.get(6) == calendarD.get(6)) {
            return context.getString(2131961040);
        }
        int i = calendarD.get(6) - calendar.get(6);
        if (calendarD.get(1) == calendar.get(1) && i == 1) {
            return context.getString(2131961041);
        }
        int i2 = calendarD.get(6) - calendar.get(6);
        if (calendarD.get(1) != calendar.get(1) || i2 <= 0 || i2 > 7) {
            return calendar.get(1) == calendarD.get(1) ? ((SimpleDateFormat) ((idd1) this.c).getValue()).format(new Date(jLongValue)) : ((SimpleDateFormat) ((idd1) this.d).getValue()).format(new Date(jLongValue));
        }
        return ((SimpleDateFormat) ((idd1) this.b).getValue()).format(new Date(jLongValue));
    }

    public void d(FacebookException facebookException) {
        rq40 rq40Var = (rq40) this.c;
        tye0 tye0VarH = rq40Var.h();
        rye0 rye0Var = rq40Var.h().g;
        String message = facebookException != null ? facebookException.getMessage() : null;
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        tye0VarH.g(new sye0(rye0Var, 3, (xd) null, (rl8) null, TextUtils.join(": ", arrayList), (String) null));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:12:0x002b, B:33:0x007e, B:35:0x0084, B:37:0x008a, B:39:0x008d, B:41:0x0091, B:42:0x00a4, B:44:0x00aa, B:46:0x00b2, B:47:0x00b6, B:49:0x00be, B:51:0x00c4, B:53:0x00d0, B:54:0x00d5, B:56:0x00db, B:57:0x00e0, B:58:0x00e1, B:61:0x00ed), top: B:77:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008a A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:12:0x002b, B:33:0x007e, B:35:0x0084, B:37:0x008a, B:39:0x008d, B:41:0x0091, B:42:0x00a4, B:44:0x00aa, B:46:0x00b2, B:47:0x00b6, B:49:0x00be, B:51:0x00c4, B:53:0x00d0, B:54:0x00d5, B:56:0x00db, B:57:0x00e0, B:58:0x00e1, B:61:0x00ed), top: B:77:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008d A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:12:0x002b, B:33:0x007e, B:35:0x0084, B:37:0x008a, B:39:0x008d, B:41:0x0091, B:42:0x00a4, B:44:0x00aa, B:46:0x00b2, B:47:0x00b6, B:49:0x00be, B:51:0x00c4, B:53:0x00d0, B:54:0x00d5, B:56:0x00db, B:57:0x00e0, B:58:0x00e1, B:61:0x00ed), top: B:77:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0091 A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:12:0x002b, B:33:0x007e, B:35:0x0084, B:37:0x008a, B:39:0x008d, B:41:0x0091, B:42:0x00a4, B:44:0x00aa, B:46:0x00b2, B:47:0x00b6, B:49:0x00be, B:51:0x00c4, B:53:0x00d0, B:54:0x00d5, B:56:0x00db, B:57:0x00e0, B:58:0x00e1, B:61:0x00ed), top: B:77:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:12:0x002b, B:33:0x007e, B:35:0x0084, B:37:0x008a, B:39:0x008d, B:41:0x0091, B:42:0x00a4, B:44:0x00aa, B:46:0x00b2, B:47:0x00b6, B:49:0x00be, B:51:0x00c4, B:53:0x00d0, B:54:0x00d5, B:56:0x00db, B:57:0x00e0, B:58:0x00e1, B:61:0x00ed), top: B:77:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00be A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:12:0x002b, B:33:0x007e, B:35:0x0084, B:37:0x008a, B:39:0x008d, B:41:0x0091, B:42:0x00a4, B:44:0x00aa, B:46:0x00b2, B:47:0x00b6, B:49:0x00be, B:51:0x00c4, B:53:0x00d0, B:54:0x00d5, B:56:0x00db, B:57:0x00e0, B:58:0x00e1, B:61:0x00ed), top: B:77:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c4 A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:12:0x002b, B:33:0x007e, B:35:0x0084, B:37:0x008a, B:39:0x008d, B:41:0x0091, B:42:0x00a4, B:44:0x00aa, B:46:0x00b2, B:47:0x00b6, B:49:0x00be, B:51:0x00c4, B:53:0x00d0, B:54:0x00d5, B:56:0x00db, B:57:0x00e0, B:58:0x00e1, B:61:0x00ed), top: B:77:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0 A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:12:0x002b, B:33:0x007e, B:35:0x0084, B:37:0x008a, B:39:0x008d, B:41:0x0091, B:42:0x00a4, B:44:0x00aa, B:46:0x00b2, B:47:0x00b6, B:49:0x00be, B:51:0x00c4, B:53:0x00d0, B:54:0x00d5, B:56:0x00db, B:57:0x00e0, B:58:0x00e1, B:61:0x00ed), top: B:77:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00db A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:12:0x002b, B:33:0x007e, B:35:0x0084, B:37:0x008a, B:39:0x008d, B:41:0x0091, B:42:0x00a4, B:44:0x00aa, B:46:0x00b2, B:47:0x00b6, B:49:0x00be, B:51:0x00c4, B:53:0x00d0, B:54:0x00d5, B:56:0x00db, B:57:0x00e0, B:58:0x00e1, B:61:0x00ed), top: B:77:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e1 A[Catch: Exception -> 0x0033, CancellationException -> 0x0036, TryCatch #3 {CancellationException -> 0x0036, Exception -> 0x0033, blocks: (B:12:0x002b, B:33:0x007e, B:35:0x0084, B:37:0x008a, B:39:0x008d, B:41:0x0091, B:42:0x00a4, B:44:0x00aa, B:46:0x00b2, B:47:0x00b6, B:49:0x00be, B:51:0x00c4, B:53:0x00d0, B:54:0x00d5, B:56:0x00db, B:57:0x00e0, B:58:0x00e1, B:61:0x00ed), top: B:77:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:70:0x010e  */
    /* JADX WARN: Code duplicated, block: B:79:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x00a4 A[SYNTHETIC] */
    public Object e(qd40 qd40Var, onm onmVar) throws NoWhenBranchMatchedException {
        ee40 ee40Var;
        Exception e;
        g6y0 g6y0Var;
        CancellationException e2;
        Object obj;
        Throwable thA;
        String message;
        ke11 ke11Var;
        ArrayList arrayList;
        h4y0 h4y0Var;
        i4y0 i4y0Var;
        u6y0 u6y0Var = ((u6y0) this.d).i;
        if (onmVar instanceof ee40) {
            ee40Var = (ee40) onmVar;
            int i = ee40Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ee40Var.d = i - Integer.MIN_VALUE;
            } else {
                ee40Var = new ee40(this, onmVar);
            }
        } else {
            ee40Var = new ee40(this, onmVar);
        }
        Object obj2 = ee40Var.b;
        int i2 = ee40Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g6y0Var = ee40Var.a;
            try {
                hm5.M(obj2);
                obj = ((e331) obj2).a;
                thA = e331.a(obj);
                if (thA == null) {
                    u6y0Var.b(g6y0Var);
                    message = thA.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    return new vd40(new i4y0(message));
                }
                ke11Var = (me11) obj;
                if (ke11Var instanceof le11) {
                    return wd40.a;
                }
                if (ke11Var instanceof ke11) {
                    throw new NoWhenBranchMatchedException();
                }
                u6y0Var.b(g6y0Var);
                List list = ke11Var.a;
                arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof h4y0) {
                        arrayList.add(obj3);
                    }
                }
                h4y0Var = (h4y0) o7h.s0(arrayList);
                if (h4y0Var != null) {
                    return new vd40(h4y0Var);
                }
                i4y0Var = (n4y0) o7h.s0(ke11Var.a);
                if (i4y0Var == null) {
                    i4y0Var = new i4y0();
                }
                return new vd40(i4y0Var);
            } catch (CancellationException e3) {
                e2 = e3;
                u6y0Var.b(g6y0Var);
                throw e2;
            } catch (Exception e4) {
                e = e4;
                u6y0Var.b(g6y0Var);
                String message2 = e.getMessage();
                return new vd40(new i4y0(message2 != null ? message2 : "Unknown error"));
            }
        }
        hm5.M(obj2);
        String str = qd40Var.a;
        if (str == null) {
            n57.e("Playlist URI is null");
            return new vd40(new i4y0("Playlist URI is null"));
        }
        String str2 = qd40Var.b;
        if (str2 != null) {
            ((e7y0) this.c).a.put(str, str2);
        }
        g6y0 g6y0VarA = u6y0Var.a(str);
        try {
            h3y0 h3y0Var = (h3y0) this.b;
            o8y0 o8y0Var = o8y0.a;
            ee40Var.a = g6y0VarA;
            ee40Var.d = 1;
            Object objE = h3y0Var.e(str, o8y0Var, ee40Var);
            d9n d9nVar = d9n.a;
            if (objE == d9nVar) {
                return d9nVar;
            }
            obj = objE;
            g6y0Var = g6y0VarA;
            thA = e331.a(obj);
            if (thA == null) {
                u6y0Var.b(g6y0Var);
                message = thA.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                return new vd40(new i4y0(message));
            }
            ke11Var = (me11) obj;
            if (ke11Var instanceof le11) {
                return wd40.a;
            }
            if (ke11Var instanceof ke11) {
                throw new NoWhenBranchMatchedException();
            }
            u6y0Var.b(g6y0Var);
            List list2 = ke11Var.a;
            arrayList = new ArrayList();
            while (r8.hasNext()) {
                if (obj3 instanceof h4y0) {
                    arrayList.add(obj3);
                }
            }
            h4y0Var = (h4y0) o7h.s0(arrayList);
            if (h4y0Var != null) {
                return new vd40(h4y0Var);
            }
            i4y0Var = (n4y0) o7h.s0(ke11Var.a);
            if (i4y0Var == null) {
                i4y0Var = new i4y0();
            }
            return new vd40(i4y0Var);
        } catch (CancellationException e5) {
            e2 = e5;
            g6y0Var = g6y0VarA;
            u6y0Var.b(g6y0Var);
            throw e2;
        } catch (Exception e6) {
            e = e6;
            g6y0Var = g6y0VarA;
            u6y0Var.b(g6y0Var);
            String message3 = e.getMessage();
            return new vd40(new i4y0(message3 != null ? message3 : "Unknown error"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object f(l0k0 l0k0Var, onm onmVar) {
        dl40 dl40Var;
        Object objA;
        l0k0 l0k0Var2 = l0k0Var;
        cbk0 cbk0Var = (cbk0) this.b;
        if (onmVar instanceof dl40) {
            dl40Var = (dl40) onmVar;
            int i = dl40Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dl40Var.d = i - Integer.MIN_VALUE;
            } else {
                dl40Var = new dl40(this, onmVar);
            }
        } else {
            dl40Var = new dl40(this, onmVar);
        }
        Object obj = dl40Var.b;
        int i2 = dl40Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            String str = cbk0Var.h;
            if (str != null) {
                return new z2k0(str, l0k0Var2.b);
            }
            i6k0 i6k0Var = (g6k0) this.c;
            String str2 = cbk0Var.a;
            String str3 = cbk0Var.b.b;
            lhg1 lhg1Var = l0k0Var2.a;
            dl40Var.a = l0k0Var2;
            dl40Var.d = 1;
            objA = i6k0Var.a(str2, str3, dl40Var, lhg1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l0k0Var2 = dl40Var.a;
            hm5.M(obj);
            objA = ((e331) obj).a;
        }
        if (e331.a(objA) == null) {
            String str4 = (String) objA;
            cbk0Var.h = str4;
            return new z2k0(str4, l0k0Var2.b);
        }
        kt91 kt91Var = (kt91) this.d;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958682});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", 2131958682, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
        return new y2k0(l0k0Var2.b);
    }

    public void h() {
        eyh0 eyh0Var = (eyh0) this.b;
        if (eyh0Var != null) {
            int i = ((kv40) this.d).n.d;
            yxh0 yxh0Var = (yxh0) eyh0Var.b;
            yxh0Var.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            yxh0Var.a.setPlaybackToLocal(builder.build());
            this.c = null;
        }
    }

    public void i(int i, int i2, int i3, String str) {
        eyh0 eyh0Var = (eyh0) this.b;
        if (eyh0Var != null) {
            ev40 ev40Var = (ev40) this.c;
            if (ev40Var != null && i == 0 && i2 == 0) {
                ev40Var.d = i3;
                ctk1.a(ev40Var.a(), i3);
            } else {
                ev40 ev40Var2 = new ev40(this, i, i2, i3, str);
                this.c = ev40Var2;
                ((yxh0) eyh0Var.b).a.setPlaybackToRemote(ev40Var2.a());
            }
        }
    }

    public boolean j() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.c;
        if (((String) this.d) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.d = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.b).readLine();
                this.d = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.d = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public void k() {
        i8h1 i8h1Var = (i8h1) ((xep) this.b).get();
        wqk0 wqk0Var = (wqk0) this.d;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, wqk0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public void l() {
        i8h1 i8h1Var = (i8h1) ((xep) this.b).get();
        wqk0 wqk0Var = (wqk0) this.d;
        x6h1 x6h1VarC = wqk0Var.c.c();
        x6h1VarC.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), y6h1VarA, wqk0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    public String m() {
        if (!j()) {
            hhg1.k();
            return null;
        }
        String str = (String) this.d;
        this.d = null;
        return str;
    }

    public void n(int i) {
        HeaderBehavior headerBehavior = (HeaderBehavior) this.d;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
        xt41 xt41Var = (View) this.c;
        int iMax = Math.max(Integer.MIN_VALUE, Math.min(i, Integer.MAX_VALUE));
        int i2 = (-((jw40) xt41Var).getTotalScrollRange()) - headerBehavior.k;
        headerBehavior.x(xt41Var);
        int iU = headerBehavior.u();
        int iMax2 = Math.max(i2, Math.min(i, 0));
        if (iU < i2 || iU > 0 || iU == iMax2) {
            return;
        }
        headerBehavior.u();
        headerBehavior.v(iMax);
        xt41Var.setAlpha(1.0f);
        jw40 jw40Var = (jw40) xt41Var;
        int iMin = Math.min(-iMax, jw40Var.getTotalScrollRange());
        xt41Var.a(iMin / jw40Var.getTotalScrollRange(), iMin);
        coordinatorLayout.f(xt41Var);
    }

    public void o(int i) {
        ago1.n((CoordinatorLayout) this.b).g(i);
    }

    public void p() {
        WeakReference weakReference;
        View view;
        Scroller scroller = (Scroller) this.c;
        if (scroller != null) {
            scroller.forceFinished(true);
        }
        if (((e160) this.b) == null || (weakReference = (WeakReference) this.d) == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.removeCallbacks((e160) this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, onm onmVar) {
        yf50 yf50Var;
        List listSingletonList;
        bpb1 bpb1Var;
        Object value;
        List list;
        if (onmVar instanceof yf50) {
            yf50Var = (yf50) onmVar;
            int i = yf50Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf50Var.c = i - Integer.MIN_VALUE;
            } else {
                yf50Var = new yf50(this, onmVar);
            }
        } else {
            yf50Var = new yf50(this, onmVar);
        }
        Object objB = yf50Var.a;
        int i2 = yf50Var.c;
        if (i2 == 0) {
            hm5.M(objB);
            Set set = s4b1.f;
            int iOrdinal = uic.x(str).c.ordinal();
            if (iOrdinal == 844) {
                listSingletonList = Collections.singletonList(str);
            } else if (iOrdinal != 860) {
                listSingletonList = z6x.a;
            } else {
                xrc0 xrc0Var = (xrc0) this.b;
                yf50Var.c = 1;
                objB = t110.b(str, yf50Var, xrc0Var);
                Object obj = d9n.a;
                if (objB == obj) {
                    return obj;
                }
            }
            bpb1Var = (bpb1) this.c;
            do {
                value = bpb1Var.getValue();
                wf50 wf50Var = (wf50) value;
                list = wf50Var.b;
                wf50Var.getClass();
            } while (!bpb1Var.k(value, new wf50(listSingletonList, list)));
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objB);
        listSingletonList = (List) objB;
        bpb1Var = (bpb1) this.c;
        do {
            value = bpb1Var.getValue();
            wf50 wf50Var2 = (wf50) value;
            list = wf50Var2.b;
            wf50Var2.getClass();
        } while (!bpb1Var.k(value, new wf50(listSingletonList, list)));
        return rih1.a;
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        HashMap map = (HashMap) this.c;
        zsc zscVar = (zsc) this.d;
        hmf hmfVar = new hmf(map, zscVar, observableEmitter);
        Set set = (Set) this.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((r630) zscVar.c).b((String) it.next(), hmfVar);
        }
        observableEmitter.setCancellable(new l530(set, zscVar, hmfVar));
    }

    public void z() {
        ImageView imageView = (ImageView) this.b;
        View view = (CardView) this.c;
        oly olyVar = (oly) this.d;
        View view2 = olyVar.m;
        if (view2 == null) {
            u890.C("sceneTitle");
            throw null;
        }
        View view3 = olyVar.n;
        if (view3 == null) {
            u890.C("sceneSubtitle");
            throw null;
        }
        for (View view4 : p7h.M(new View[]{imageView, view, view2, view3})) {
            view4.setVisibility(0);
            view4.setAlpha(olyVar.k ? 0.0f : 1.0f);
        }
    }

    public /* synthetic */ lc20(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public lc20(byte b) {
        this.a = b;
        switch (b) {
            case 6:
                this.b = new idd1(df.V0);
                this.c = new idd1(bc30.Y);
                this.d = new idd1(bc30.X);
                break;
            case 26:
                break;
            default:
                bbc bbcVarA = mno1.a(-2, 0, 6);
                this.b = bbcVarA;
                dt71 dt71VarE = mgo1.e(0, 1, 0, 5);
                this.c = dt71VarE;
                this.d = hu20.d(new mr20[]{new hxk(k4p1.B(bbcVarA), (byte) 1), new fts(dt71VarE, (byte) 3)});
                break;
        }
    }

    public lc20(i8h1 i8h1Var, n7h1 n7h1Var, String str) {
        this.a = (byte) 21;
        this.b = i8h1Var;
        this.c = n7h1Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.d = new wqk0(yon1.e0().c, str, (byte) 4);
    }

    public lc20(ConstraintLayout constraintLayout, StateListAnimatorImageButton stateListAnimatorImageButton, CameraButtonView cameraButtonView, FrameLayout frameLayout) {
        this.a = (byte) 1;
        this.b = constraintLayout;
        this.c = stateListAnimatorImageButton;
        this.d = cameraButtonView;
    }

    public lc20(epb1 epb1Var, uu00 uu00Var) {
        this.a = (byte) 8;
        this.b = epb1Var;
        this.c = uu00Var;
        fai0 fai0VarQ = w6d1.q(epb1Var, l540.d1);
        fai0 fai0VarA = w6d1.A(fai0VarQ, new u830(this, (byte) 15));
        fai0 fai0Var = new fai0();
        fai0Var.n(fai0VarQ, new p640(fai0Var, fai0VarA, (byte) 0));
        fai0Var.n(fai0VarA, new p640(fai0Var, fai0VarQ, (byte) 1));
        this.d = fai0Var;
    }

    public lc20(iac0 iac0Var, xrc0 xrc0Var) {
        this.a = (byte) 20;
        this.b = xrc0Var;
        z6x z6xVar = z6x.a;
        bpb1 bpb1VarB = gio1.b(new wf50(z6xVar, z6xVar));
        this.c = bpb1VarB;
        this.d = d5p1.t(new mt(bpb1VarB, (byte) 15), cto1.q(iac0Var), ey71.a, new vf50(z6xVar));
    }

    public /* synthetic */ lc20(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public lc20(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.a = (byte) 29;
        this.c = arrayDeque;
        this.b = bufferedReader;
    }

    public lc20(kv40 kv40Var, eyh0 eyh0Var) {
        this.a = (byte) 15;
        this.d = kv40Var;
        this.b = eyh0Var;
    }
}
