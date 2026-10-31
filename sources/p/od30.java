package p;

import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.tap.go.service.GoBluetoothService;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class od30 implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ od30(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0227  */
    /* JADX WARN: Code duplicated, block: B:157:0x0312  */
    public final void accept(Object obj) {
        rm51 rm51VarA;
        lgy lgyVarQ;
        lgy lgyVarQ2;
        int i;
        int i2;
        er91 er91VarC = null;
        switch (this.a) {
            case 0:
                ld30 ld30Var = (ld30) obj;
                t7y t7yVar = ((pd30) this.b).k;
                if (t7yVar != null) {
                    ld30Var.getClass();
                    t7yVar.m(ld30Var);
                    return;
                }
                return;
            case 1:
                Throwable th = (Throwable) obj;
                td30 td30Var = (td30) this.b;
                td30Var.k.d(oc00.d);
                td30Var.f.e("EventSender queue permanently stopped: " + th.getMessage(), th);
                return;
            case 2:
                gru gruVar = (gru) obj;
                dxy dxyVar = (dxy) this.b;
                boolean z = gruVar.b;
                if (!gruVar.a) {
                    Logger.k("A user is not logged in - product state change is ignored", new Object[0]);
                    return;
                }
                if (z && u890.j((Boolean) dxyVar.g, Boolean.FALSE)) {
                    ((lzn0) dxyVar.b).f(new dwn0("spotify:home", "", true, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                }
                dxyVar.g = Boolean.valueOf(z);
                return;
            case 3:
                r981 r981Var = (s981) obj;
                ur00 ur00Var = (ur00) this.b;
                r981 r981Var2 = r981Var instanceof r981 ? r981Var : null;
                ur00Var.e = r981Var2 != null ? r981Var2.a : null;
                return;
            case 4:
                b840 b840Var = (b840) this.b;
                b840Var.c.b();
                b840Var.c.k(new er91((fs91) null, b840Var.a.getString(2131956111), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return;
            case 5:
                w8l w8lVar = (w8l) obj;
                GoBluetoothService goBluetoothService = (GoBluetoothService) this.b;
                int i3 = GoBluetoothService.h;
                ArrayList<w8l> arrayListC = goBluetoothService.a().c();
                Context applicationContext = goBluetoothService.getApplicationContext();
                Uri uri = gz40.a;
                StringBuilder sb = new StringBuilder(0);
                for (w8l w8lVar2 : arrayListC) {
                    String name = w8lVar2.a.getName();
                    if (jhc1.F(name)) {
                        name = applicationContext.getString(2131952370);
                    }
                    int iC = l1d.C(w8lVar2.b);
                    String string = iC != 1 ? iC != 2 ? "" : applicationContext.getString(2131952369, name) : applicationContext.getString(2131952371, name);
                    string.getClass();
                    if (sb.length() > 0 && string.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(string);
                }
                String string2 = sb.toString();
                k961 k961Var = goBluetoothService.a;
                if (k961Var == null) {
                    u890.C("serviceForegroundManager");
                    throw null;
                }
                k961Var.g("com.spotify.tap.go.service.GoBluetoothService", string2);
                if (w8lVar.b == 4 && goBluetoothService.a().c().isEmpty()) {
                    Logger.b("Go: No active connections, stopping service", new Object[0]);
                    goBluetoothService.stopSelf();
                    return;
                }
                return;
            case 6:
                Logger.e((Throwable) obj, "Go: Session flow error for %s", new Object[]{((BluetoothDevice) this.b).getAddress()});
                return;
            case 7:
                rz40 rz40Var = (rz40) this.b;
                h3u h3uVar = ((s5w0) rz40Var).F1;
                if (h3uVar != null) {
                    h3uVar.Z0(rz40Var);
                    return;
                }
                return;
            case 8:
                xz40 xz40Var = (xz40) this.b;
                if (xz40Var.S0 == null) {
                    return;
                }
                b050 b050Var = xz40Var.d;
                yqg yqgVar = xz40Var.f;
                dma1 dma1Var = b050Var.a;
                bma1 bma1Var = c050.a;
                long jG = dma1Var.g(bma1Var, -1L);
                if (jG == -1) {
                    l1d.B(yqgVar, dma1Var.edit(), bma1Var);
                } else {
                    long jB = yqgVar.b();
                    bma1 bma1Var2 = c050.b;
                    if (dma1Var.g(bma1Var2, -1L) != -1) {
                        bma1 bma1Var3 = c050.c;
                        if (dma1Var.g(bma1Var3, -1L) != -1 || jG + 1900800000 > jB) {
                            return;
                        }
                        hma1 hma1VarEdit = dma1Var.edit();
                        hma1VarEdit.c(bma1Var3, jB);
                        hma1VarEdit.g();
                    } else {
                        if (jG + 691200000 > jB) {
                            return;
                        }
                        hma1 hma1VarEdit2 = dma1Var.edit();
                        hma1VarEdit2.c(bma1Var2, jB);
                        hma1VarEdit2.g();
                    }
                }
                View view = xz40Var.S0;
                if (view != null) {
                    slc0 slc0Var = new slc0(UUID.randomUUID().toString());
                    x4f1 x4f1Var = xz40Var.a;
                    View viewInflate = xz40Var.R0.inflate(2131625051, (ViewGroup) null);
                    sus susVar = xz40Var.b;
                    oh31 oh31Var = new oh31();
                    viewInflate.getClass();
                    oh31Var.h = viewInflate;
                    mus musVarB = sus.b(susVar, oh31Var);
                    ((Button) viewInflate.findViewById(2131429023)).setOnClickListener(new t230(xz40Var, slc0Var, (byte) 3));
                    ((Button) viewInflate.findViewById(2131429021)).setOnClickListener(new zfs(xz40Var, (byte) 14));
                    x4f1.a(x4f1Var, musVarB, view, new hs20(xz40Var, slc0Var, (byte) 11), (g5f1) null, 44);
                    return;
                }
                return;
            case 9:
                Throwable th2 = (Throwable) obj;
                Logger.d(f4i1.f("[LiveSharing] Error terminating live-sharing, caused by: ", th2.getMessage(), "."), new Object[0]);
                ((x350) this.b).d(new hsd0(th2));
                return;
            case 10:
                hma1 hma1VarEdit3 = ((dma1) this.b).edit();
                hma1VarEdit3.d(a450.g, (String) obj);
                hma1VarEdit3.g();
                return;
            case 11:
                kg0.e((kg0) this.b, new yit(new c3f0(((ia50) obj).b), bk8.N0, (n5o) null, 12), new ifl1((Object) null, (byte) 25));
                return;
            case 12:
                se50 se50Var = (se50) obj;
                te50 te50Var = (te50) this.b;
                ub10 ub10Var = se50Var.a;
                boolean z2 = se50Var.b == 0;
                qah qahVar = te50Var.b;
                int i4 = ub10Var.a;
                if (!z2) {
                    qahVar.a(i4);
                    return;
                } else {
                    qahVar.a.c(i4);
                    qahVar.b = i4;
                    return;
                }
            case 13:
                ((lbc0) this.b).invoke(obj);
                return;
            case 14:
                d5b d5bVar = (d5b) obj;
                qh50 qh50Var = (qh50) this.b;
                String str = d5bVar.g;
                String str2 = d5bVar.h;
                int length = str.length();
                Activity activity = qh50Var.a;
                String string3 = length == 0 ? activity.getResources().getString(2131956778, str2) : activity.getResources().getString(2131956777, str, str2);
                string3.getClass();
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", string3);
                intent.setType("text/plain");
                activity.startActivity(Intent.createChooser(intent, null));
                return;
            case 15:
                g5p0 g5p0Var = ((co50) this.b).a;
                tqw tqwVar = ((lo50) obj).a;
                g5p0.b(g5p0Var, tqwVar != null ? n3o1.y(tqwVar).a : null, 2);
                return;
            case 16:
                ((wp20) this.b).c = (String) obj;
                return;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                mmr0 mmr0Var = (mmr0) obj;
                ju41 ju41Var = (ju41) mmr0Var.a;
                mmr0 mmr0Var2 = (mmr0) mmr0Var.b;
                long jLongValue = ((Number) mmr0Var2.a).longValue();
                long jLongValue2 = ((Number) mmr0Var2.b).longValue();
                tr60 tr60Var = (tr60) this.b;
                int i5 = tr60.y1;
                VideoSurfaceView videoSurfaceView = tr60Var.k1;
                qr60 qr60Var = tr60Var.i1;
                if (qr60Var.d) {
                    if (ju41Var instanceof iu41) {
                        int i6 = VideoSurfaceView.v1;
                        ImageView imageView = videoSurfaceView.Q0;
                        if (imageView == null) {
                            u890.C("seekFrameView");
                            throw null;
                        }
                        imageView.setImageBitmap(null);
                        ImageView imageView2 = videoSurfaceView.Q0;
                        if (imageView2 == null) {
                            u890.C("seekFrameView");
                            throw null;
                        }
                        imageView2.setVisibility(0);
                        videoSurfaceView.t1 = false;
                        Function0 function0 = videoSurfaceView.m1;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    } else if (ju41Var instanceof hu41) {
                        long j = (((long) ((hu41) ju41Var).a) - jLongValue) + jLongValue2;
                        String str3 = videoSurfaceView.s1;
                        ImageView imageView3 = videoSurfaceView.Q0;
                        if (imageView3 == null) {
                            u890.C("seekFrameView");
                            throw null;
                        }
                        if (imageView3.getVisibility() == 0) {
                            sm51 sm51Var = videoSurfaceView.l1;
                            if (sm51Var == null) {
                                rm51VarA = null;
                            } else {
                                ImageView imageView4 = videoSurfaceView.Q0;
                                if (imageView4 == null) {
                                    u890.C("seekFrameView");
                                    throw null;
                                }
                                int width = imageView4.getWidth();
                                ImageView imageView5 = videoSurfaceView.Q0;
                                if (imageView5 == null) {
                                    u890.C("seekFrameView");
                                    throw null;
                                }
                                rm51VarA = sm51Var.a(width, j, imageView5.getHeight());
                                if (rm51VarA != null) {
                                    rm51 rm51Var = videoSurfaceView.r1;
                                    if (rm51Var != null) {
                                        rm51Var.b.b();
                                    }
                                    ywv0 ywv0Var = videoSurfaceView.k1;
                                    if (ywv0Var != null) {
                                        ((bpb1) ywv0Var.d).m((Object) null, Boolean.FALSE);
                                    }
                                    videoSurfaceView.r1 = rm51VarA;
                                } else {
                                    rm51VarA = null;
                                }
                            }
                            if (rm51VarA != null) {
                                ixg ixgVar = rm51VarA.b;
                                ixgVar.r(str3);
                                ixgVar.h = Collections.singletonMap("seekframe_origin", "user_seek");
                                ixgVar.f = false;
                                ImageView imageView6 = videoSurfaceView.Q0;
                                if (imageView6 == null) {
                                    u890.C("seekFrameView");
                                    throw null;
                                }
                                ixgVar.k(imageView6, new o0g(videoSurfaceView, j, (byte) 18));
                            }
                        }
                    } else {
                        if (!(ju41Var instanceof gu41)) {
                            eg.o();
                            return;
                        }
                        rm51 rm51Var2 = videoSurfaceView.r1;
                        if (rm51Var2 != null) {
                            rm51Var2.b.b();
                        }
                        ImageView imageView7 = videoSurfaceView.Q0;
                        if (imageView7 == null) {
                            u890.C("seekFrameView");
                            throw null;
                        }
                        imageView7.setVisibility(8);
                        ImageView imageView8 = videoSurfaceView.Q0;
                        if (imageView8 == null) {
                            u890.C("seekFrameView");
                            throw null;
                        }
                        imageView8.setImageBitmap(null);
                        Function0 function1 = videoSurfaceView.n1;
                        if (function1 != null) {
                            function1.invoke();
                        }
                    }
                }
                FrameLayout frameLayout = tr60Var.s1;
                if (qr60Var.e) {
                    if (ju41Var instanceof iu41) {
                        if (frameLayout != null) {
                            frameLayout.setVisibility(0);
                        }
                        rok0 rok0Var = tr60Var.o1;
                        if (rok0Var != null) {
                            rok0Var.i();
                            return;
                        }
                        return;
                    }
                    if (ju41Var instanceof hu41) {
                        return;
                    }
                    if (!(ju41Var instanceof gu41)) {
                        eg.o();
                        return;
                    } else {
                        if (frameLayout != null) {
                            frameLayout.setVisibility(8);
                            return;
                        }
                        return;
                    }
                }
                return;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((vu60) this.b).e.l(((fv60) obj).a);
                return;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                az81 az81Var = ((bz81) ((g9r) this.b).c).c;
                if (az81Var.h == az81Var.g.getAndIncrement()) {
                    az81Var.a.cancel();
                    return;
                }
                return;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                hj70 hj70Var = (hj70) obj;
                rj70 rj70Var = (rj70) this.b;
                kt91 kt91Var = rj70Var.b;
                Context context = rj70Var.a;
                if (hj70Var instanceof ri70) {
                    lgyVarQ = k4k.p(2131956951);
                } else if (hj70Var instanceof qi70) {
                    hur hurVar = rj70Var.e;
                    if (hurVar.k()) {
                        hurVar.u();
                        lgyVarQ2 = k4k.p(2131956950);
                        lgyVarQ2.g = new qj70(rj70Var, (byte) 1);
                        lgyVarQ = lgyVarQ2;
                    } else {
                        lgyVarQ = null;
                    }
                } else {
                    if (hj70Var instanceof bi70) {
                        int iC2 = l1d.C(((bi70) hj70Var).c);
                        if (iC2 == 0) {
                            i2 = 2131956814;
                        } else if (iC2 == 1) {
                            i2 = 2131956815;
                        } else {
                            if (iC2 != 2) {
                                eg.o();
                                return;
                            }
                            i2 = 2131956812;
                        }
                        lgyVarQ2 = k4k.p(i2);
                        lgyVarQ2.b(2131956813);
                        lgyVarQ2.g = new qj70(rj70Var, (byte) 0);
                    } else if (hj70Var instanceof aj70) {
                        z9o0 z9o0VarQ = f3o1.q(context.getResources(), (aj70) hj70Var);
                        if (z9o0VarQ == null) {
                            lgyVarQ = null;
                        } else {
                            lgy lgyVarQ3 = k4k.q(z9o0VarQ.a);
                            lgyVarQ3.b(z9o0VarQ.b);
                            lgyVarQ3.g = new qj70(rj70Var, (byte) 3);
                            lgyVarQ = lgyVarQ3;
                        }
                    } else if (hj70Var instanceof yi70) {
                        lgyVarQ = k4k.q(context.getString(2131956823));
                    } else if (hj70Var instanceof zi70) {
                        lgyVarQ = k4k.q(context.getString(((zi70) hj70Var).c ? 2131956808 : 2131956816));
                    } else if (hj70Var instanceof cj70) {
                        lgyVarQ = k4k.p(2131956817);
                    } else if (hj70Var instanceof dj70) {
                        lgyVarQ = k4k.p(2131956822);
                    } else if (hj70Var instanceof xi70) {
                        xi70 xi70Var = (xi70) hj70Var;
                        boolean z3 = xi70Var.c;
                        boolean z4 = xi70Var.d;
                        if (z3) {
                            if (z4) {
                                i = 2131956820;
                            } else {
                                if (z4) {
                                    eg.o();
                                    return;
                                }
                                i = 2131956821;
                            }
                        } else if (z3) {
                            eg.o();
                            return;
                        } else if (z4) {
                            i = 2131956818;
                        } else {
                            if (z4) {
                                eg.o();
                                return;
                            }
                            i = 2131956819;
                        }
                        lgyVarQ = k4k.p(i);
                    } else if (hj70Var instanceof zh70) {
                        lgyVarQ = k4k.q(((zh70) hj70Var).c);
                    } else if (hj70Var.equals(ej70.c)) {
                        lgyVarQ = k4k.q(context.getString(2131955899));
                    } else if (hj70Var instanceof oi70) {
                        oi70 oi70Var = (oi70) hj70Var;
                        if (oi70Var instanceof li70) {
                            lgyVarQ2 = k4k.q(context.getString(2131956627, ((li70) hj70Var).c));
                            lgyVarQ2.b(2131956626);
                            lgyVarQ2.g = new qj70(rj70Var, (byte) 2);
                            lgyVarQ2.i = new dvr(rj70Var, (byte) 1);
                        } else if (oi70Var instanceof mi70) {
                            lgyVarQ = k4k.p(2131956628);
                        } else if (oi70Var instanceof ni70) {
                            lgyVarQ = k4k.p(2131956629);
                        } else {
                            if (!(oi70Var instanceof ki70)) {
                                eg.o();
                                return;
                            }
                            lgyVarQ = k4k.q(context.getString(2131956616, ((ki70) hj70Var).c));
                        }
                    } else {
                        lgyVarQ = null;
                    }
                    lgyVarQ = lgyVarQ2;
                }
                if (lgyVarQ != null) {
                    lgyVarQ.a = true;
                    er91VarC = lgyVarQ.c();
                }
                if (er91VarC != null) {
                    if (kt91Var.g()) {
                        kt91Var.k(er91VarC);
                        return;
                    } else {
                        kt91Var.o(er91VarC);
                        return;
                    }
                }
                return;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((psc) this.b).b.b();
                return;
            case 22:
                ((ze90) this.b).a.onNext((Boolean) obj);
                return;
            case 23:
                ((BehaviorSubject) ((cf90) this.b).b).onNext((Boolean) obj);
                return;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Logger.e((Throwable) obj, "Failed to handle event: %s", new Object[]{(vr90) this.b});
                return;
            case 25:
                Logger.e((Throwable) obj, "Failed to handle event: %s", new Object[]{(zy90) this.b});
                return;
            case 26:
                ((kt91) ((k1a0) this.b).e).k((er91) obj);
                return;
            case 27:
                ((qd9) this.b).a.accept(new ld9(((e3a0) obj).a));
                return;
            case 28:
                v3a0 v3a0Var = (v3a0) obj;
                ((g2z) this.b).v(2, v3a0Var.a, v3a0Var.b);
                return;
            default:
                ((xzf) this.b).a((lva0) obj);
                return;
        }
    }
}
