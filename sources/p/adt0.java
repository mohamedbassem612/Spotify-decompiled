package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.text.TextUtils;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class adt0 extends rvh0 {
    public static final ArrayList S0;
    public static final ArrayList T0;
    public int N0;
    public boolean O0;
    public boolean P0;
    public final ArrayList Q0;
    public final ArrayList R0;
    public final twh0 X;
    public final uwh0 Y;
    public final MediaRouter.RouteCategory Z;
    public final kv40 i;
    public final MediaRouter t;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        S0 = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        T0 = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public adt0(Context context, kv40 kv40Var) {
        super(context, new hod0(new ComponentName("android", adt0.class.getName()), (byte) 13));
        this.Q0 = new ArrayList();
        this.R0 = new ArrayList();
        this.i = kv40Var;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.t = mediaRouter;
        this.X = qmo1.m(this);
        this.Y = qmo1.o(this);
        this.Z = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131958941), false);
        t();
    }

    public static ddt0 n(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof ddt0) {
            return (ddt0) tag;
        }
        return null;
    }

    public static void u(ddt0 ddt0Var) {
        MediaRouter.UserRouteInfo userRouteInfo = ddt0Var.b;
        lwh0 lwh0Var = ddt0Var.a;
        userRouteInfo.setName(lwh0Var.d);
        userRouteInfo.setPlaybackType(lwh0Var.l);
        userRouteInfo.setPlaybackStream(lwh0Var.m);
        userRouteInfo.setVolume(lwh0Var.f69p);
        userRouteInfo.setVolumeMax(lwh0Var.q);
        userRouteInfo.setVolumeHandling(lwh0Var.c());
        userRouteInfo.setDescription(lwh0Var.e);
    }

    @Override // p.rvh0
    public final nvh0 c(String str) {
        int iK = k(str);
        if (iK >= 0) {
            return new bdt0(((cdt0) this.Q0.get(iK)).a);
        }
        return null;
    }

    @Override // p.rvh0
    public final void f(hvh0 hvh0Var) {
        boolean zB;
        int i = 0;
        if (hvh0Var != null) {
            hvh0Var.a();
            ArrayList arrayListB = hvh0Var.c.b();
            int size = arrayListB.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) arrayListB.get(i);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i2 |= 1;
                } else {
                    i2 = str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                }
                i++;
            }
            zB = hvh0Var.b();
            i = i2;
        } else {
            zB = false;
        }
        if (this.N0 == i && this.O0 == zB) {
            return;
        }
        this.N0 = i;
        this.O0 = zB;
        t();
    }

    public final boolean i(MediaRouter.RouteInfo routeInfo) {
        String strK;
        if (n(routeInfo) != null || j(routeInfo) >= 0) {
            return false;
        }
        String str = this.t.getDefaultRoute() == routeInfo ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(m(routeInfo).hashCode()));
        if (k(str) >= 0) {
            int i = 2;
            while (true) {
                Locale locale = Locale.US;
                strK = l1d.k(i, str, "_");
                if (k(strK) < 0) {
                    break;
                }
                i++;
            }
            str = strK;
        }
        cdt0 cdt0Var = new cdt0(routeInfo, str);
        s(cdt0Var);
        this.Q0.add(cdt0Var);
        return true;
    }

    public final int j(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((cdt0) arrayList.get(i)).a == routeInfo) {
                return i;
            }
        }
        return -1;
    }

    public final int k(String str) {
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((cdt0) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int l(lwh0 lwh0Var) {
        ArrayList arrayList = this.R0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((ddt0) arrayList.get(i)).a == lwh0Var) {
                return i;
            }
        }
        return -1;
    }

    public final String m(MediaRouter.RouteInfo routeInfo) {
        int i;
        Context context = this.a;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) != 0) {
            return "";
        }
        int deviceType = routeInfo.getDeviceType();
        if (deviceType == 1) {
            i = 2131958938;
        } else if (deviceType != 2) {
            i = deviceType != 3 ? 2131958939 : 2131958936;
        } else {
            i = 2131958937;
        }
        return context.getString(i);
    }

    public final void o(lwh0 lwh0Var) {
        rvh0 rvh0VarB = lwh0Var.b();
        MediaRouter mediaRouter = this.t;
        if (rvh0VarB == this) {
            int iJ = j(mediaRouter.getSelectedRoute(8388611));
            if (iJ < 0 || !((cdt0) this.Q0.get(iJ)).b.equals(lwh0Var.b)) {
                return;
            }
            lwh0Var.k(false);
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.Z);
        ddt0 ddt0Var = new ddt0(lwh0Var, userRouteInfoCreateUserRoute);
        userRouteInfoCreateUserRoute.setTag(ddt0Var);
        userRouteInfoCreateUserRoute.setVolumeCallback(this.Y);
        u(ddt0Var);
        this.R0.add(ddt0Var);
        mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
    }

    public final void p(lwh0 lwh0Var) {
        int iL;
        if (lwh0Var.b() == this || (iL = l(lwh0Var)) < 0) {
            return;
        }
        MediaRouter.UserRouteInfo userRouteInfo = ((ddt0) this.R0.remove(iL)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
            this.t.removeUserRoute(userRouteInfo);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void q(lwh0 lwh0Var) {
        if (lwh0Var.f()) {
            rvh0 rvh0VarB = lwh0Var.b();
            MediaRouter mediaRouter = this.t;
            if (rvh0VarB != this) {
                int iL = l(lwh0Var);
                if (iL >= 0) {
                    mediaRouter.selectRoute(8388611, ((ddt0) this.R0.get(iL)).b);
                    return;
                }
                return;
            }
            int iK = k(lwh0Var.b);
            if (iK >= 0) {
                mediaRouter.selectRoute(8388611, ((cdt0) this.Q0.get(iK)).a);
            }
        }
    }

    public final void r() {
        svh0 svh0Var = new svh0((byte) 0);
        ArrayList arrayList = this.Q0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            svh0Var.d(((cdt0) arrayList.get(i)).c);
        }
        g(svh0Var.f());
    }

    public final void s(cdt0 cdt0Var) {
        String str = cdt0Var.b;
        MediaRouter.RouteInfo routeInfo = cdt0Var.a;
        wmy wmyVar = new wmy(str, m(routeInfo));
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            wmyVar.d(S0);
        }
        if ((supportedTypes & 2) != 0) {
            wmyVar.d(T0);
        }
        wmyVar.C(routeInfo.getPlaybackType());
        wmyVar.B(routeInfo.getPlaybackStream());
        wmyVar.F(routeInfo.getVolume());
        wmyVar.H(routeInfo.getVolumeMax());
        wmyVar.G(routeInfo.getVolumeHandling());
        wmyVar.A((supportedTypes & 8388608) == 0);
        if (!routeInfo.isEnabled()) {
            wmyVar.y(false);
        }
        if (routeInfo.isConnecting()) {
            wmyVar.v(1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            wmyVar.D(presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            wmyVar.w(description.toString());
        }
        wmyVar.x(routeInfo.getDeviceType());
        cdt0Var.c = wmyVar.h();
    }

    public final void t() {
        boolean z = this.P0;
        twh0 twh0Var = this.X;
        MediaRouter mediaRouter = this.t;
        if (z) {
            mediaRouter.removeCallback(twh0Var);
        }
        this.P0 = true;
        mediaRouter.addCallback(this.N0, twh0Var, (this.O0 ? 1 : 0) | 2);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zI = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zI |= i((MediaRouter.RouteInfo) it.next());
        }
        if (zI) {
            r();
        }
    }
}
