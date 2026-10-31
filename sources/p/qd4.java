package p;

import android.companion.virtual.VirtualDeviceManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.foreground.SystemForegroundService;
import com.spotify.encoremobile.tooltip.TooltipContainer;
import defpackage.g;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qd4 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qd4(vy71 vy71Var, c9n c9nVar, o95 o95Var, Function0 function0) {
        this.a = (byte) 4;
        this.b = vy71Var;
        this.d = c9nVar;
        this.e = o95Var;
        this.c = function0;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ((c4u) this.b).f((Function0) this.c, (i3u) this.d, (flb0) this.e);
                return rih1.a;
            case 1:
                iss issVar = (iss) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                Object obj = this.d;
                p811 p811Var = (p811) this.e;
                rih1 rih1Var = rih1.a;
                th30.P(2);
                Object objI = issVar.f.i(viewGroup, obj);
                issVar.f74p = objI;
                if (objI == null) {
                    th30.P(2);
                    issVar.q = true;
                } else {
                    p811Var.a = new hss(issVar, obj, viewGroup);
                    if (th30.P(2)) {
                        foa1 foa1Var = issVar.d;
                        foa1 foa1Var2 = issVar.e;
                        Objects.toString(foa1Var);
                        Objects.toString(foa1Var2);
                    }
                }
                return rih1Var;
            case 2:
                x340 x340Var = (x340) this.b;
                xce xceVar = (xce) this.c;
                ye91 ye91Var = (ye91) this.d;
                znm0 znm0Var = (znm0) this.e;
                c0k c0kVar = x340Var.M;
                xce xceVar2 = c0kVar.b;
                try {
                    c0kVar.b = xceVar;
                    ye91 ye91Var2 = x340Var.G;
                    int[] iArr = x340Var.o;
                    fdn0 fdn0Var = x340Var.v;
                    x340Var.o = null;
                    x340Var.v = null;
                    try {
                        x340Var.G = ye91Var;
                        boolean z = c0kVar.e;
                        try {
                            c0kVar.e = false;
                            x340Var.J(znm0Var.a, znm0Var.g, znm0Var.b, true);
                            c0kVar.e = z;
                            x340Var.G = ye91Var2;
                            x340Var.o = iArr;
                            x340Var.v = fdn0Var;
                            c0kVar.b = xceVar2;
                            return rih1.a;
                        } catch (Throwable th) {
                            c0kVar.e = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        x340Var.G = ye91Var2;
                        x340Var.o = iArr;
                        x340Var.v = fdn0Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c0kVar.b = xceVar2;
                    throw th3;
                }
            case 3:
                Number number = (Number) this.b;
                cb80 cb80Var = (cb80) this.c;
                Number number2 = (Number) this.d;
                bb80 bb80Var = (bb80) this.e;
                if (!number.equals(cb80Var.a) || !number2.equals(cb80Var.b)) {
                    cb80Var.a = number;
                    cb80Var.b = number2;
                    cb80Var.e = new hrd1(bb80Var, cb80Var.c, number, number2, (oe5) null);
                    cb80Var.i.b.setValue(Boolean.TRUE);
                    cb80Var.f = false;
                    cb80Var.g = true;
                }
                return rih1.a;
            case 4:
                vy71 vy71Var = (vy71) this.b;
                c9n c9nVar = (c9n) this.d;
                o95 o95Var = (o95) this.e;
                Function0 function0 = (Function0) this.c;
                if (vy71Var.d() == xy71.b && vy71Var.f()) {
                    fn31.T(c9nVar, null, 0, new b(o95Var, (lnm) null, (byte) 17), 3);
                    fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 11), 3);
                } else {
                    fn31.T(c9nVar, null, 0, new g(vy71Var, null, (byte) 12), 3).L(new ki5(function0, (byte) 3));
                }
                return rih1.a;
            case 5:
                qkx0.g((VirtualDeviceManager) this.b, (pkx0) this.c, (DisplayManager) this.d, (okx0) this.e);
                return rih1.a;
            case 6:
                return new iad1((jad1) this.b, (wat) this.c, (iu30) this.d, (iu30) this.e);
            case 7:
                TooltipContainer tooltipContainer = (TooltipContainer) this.b;
                View view = (View) this.c;
                d4f1 d4f1Var = (d4f1) this.d;
                d3j0 d3j0Var = (d3j0) this.e;
                int i = TooltipContainer.P0;
                tooltipContainer.d(view, d4f1Var, d3j0Var);
                return rih1.a;
            default:
                tvl1 tvl1Var = (tvl1) this.b;
                UUID uuid = (UUID) this.c;
                bd30 bd30Var = (bd30) this.d;
                Context context = (Context) this.e;
                String string = uuid.toString();
                vwl1 vwl1VarD = tvl1Var.c.d(string);
                if (vwl1VarD == null || vwl1VarD.b.a()) {
                    eg.m("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    lsw0 lsw0Var = tvl1Var.b;
                    synchronized (lsw0Var.k) {
                        try {
                            qs10.a().getClass();
                            sxl1 sxl1Var = (sxl1) lsw0Var.g.remove(string);
                            if (sxl1Var != null) {
                                if (lsw0Var.a == null) {
                                    PowerManager.WakeLock wakeLockA = v4l1.a(lsw0Var.b);
                                    lsw0Var.a = wakeLockA;
                                    wakeLockA.acquire();
                                }
                                lsw0Var.f.put(string, sxl1Var);
                                x74.u0(lsw0Var.b, udd1.b(lsw0Var.b, yoi1.z(sxl1Var.a), bd30Var));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                        break;
                    }
                    uvl1 uvl1VarZ = yoi1.z(vwl1VarD);
                    int i2 = udd1.t;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", bd30Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", bd30Var.b);
                    intent.putExtra("KEY_NOTIFICATION", bd30Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", uvl1VarZ.a);
                    intent.putExtra("KEY_GENERATION", uvl1VarZ.b);
                    context.startService(intent);
                }
                return null;
        }
    }

    public /* synthetic */ qd4(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
