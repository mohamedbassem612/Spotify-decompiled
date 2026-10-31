package p;

import android.content.Context;
import com.spotify.eventsender.eventsender.EventSenderDatabase;
import com.spotify.eventsender.eventsender.MissingTransportException;
import com.spotify.eventsender.gabo.PublishEventsResponse;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gc00 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lc00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc00(lc00 lc00Var, byte b) {
        super(0);
        this.a = b;
        this.b = lc00Var;
    }

    /* JADX WARN: Type inference failed for: r2v20, types: [p.jc00] */
    /* JADX WARN: Type inference failed for: r3v16, types: [p.jc00] */
    /* JADX WARN: Type inference failed for: r7v6, types: [p.ic00] */
    public final Object invoke() {
        byte b = this.a;
        final byte b2 = 1;
        final byte b3 = 0;
        lc00 lc00Var = this.b;
        switch (b) {
            case 0:
                return new xk4(lc00Var.e);
            case 1:
                lc00Var.f().getClass();
                return ac00.a;
            case 2:
                return new brg(lc00Var.a().w(), lc00Var.a().u(), (xk4) lc00Var.p.getValue(), lc00Var.e(), lc00Var.d());
            case 3:
                Context context = lc00Var.e;
                lc00Var.f().getClass();
                bn31 bn31VarT = u890.t(context, EventSenderDatabase.class, "event-sender.db");
                bn31VarT.a(new trj0[]{new xrj0((byte) 19, 6, 7), new xrj0((byte) 20, 7, 8), new xrj0((byte) 21, 8, 9), new xrj0((byte) 22, 9, 10), new xrj0((byte) 17, 10, 11)});
                bn31VarT.d();
                return bn31VarT.c();
            case 4:
                return new fc00(f46.S0(new dc00[]{(rav) lc00Var.B.getValue(), lc00Var.d()}), new qfl1(lc00Var.e), lc00Var.e(), (Observable) lc00Var.b.e(Observable.just(Boolean.TRUE)), new nty(lc00Var, (byte) 26));
            case 5:
                final lc00 lc00Var2 = this.b;
                ud00 ud00VarV = lc00Var2.a().v();
                trz0 trz0Var = (trz0) lc00Var2.z.getValue();
                rav ravVar = (rav) lc00Var2.B.getValue();
                sua suaVar = new sua((byte) 10);
                s561 s561Var = (s561) lc00Var2.s.getValue();
                t561 t561Var = (t561) lc00Var2.t.getValue();
                s900 s900Var = (s900) lc00Var2.u.getValue();
                ac00 ac00Var = (ac00) lc00Var2.j.getValue();
                mb00 mb00Var = (mb00) lc00Var2.w.getValue();
                uny unyVar = new uny((byte) 11);
                zq4 zq4VarE = lc00Var2.e();
                final int i = 0;
                final byte b4 = 1;
                final Class<lc00> cls = lc00.class;
                final String str = "eventSenderConfig";
                final String str2 = "getEventSenderConfig()Lcom/spotify/eventsender/config/MutableEventSenderConfig;";
                kc00 kc00Var = new kc00(new den0(lc00Var2, cls, str, str2, i) { // from class: p.on5
                    public final Object get() {
                        switch (b4) {
                            case 0:
                                return ((pn5) ((lyc) this).receiver).d;
                            case 1:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 2:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 3:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 4:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 5:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 6:
                                return ((lc00) ((lyc) this).receiver).c();
                            default:
                                return ((ven0) ((lyc) this).receiver).getValue();
                        }
                    }
                }, (byte) 0);
                lc00Var2.f().getClass();
                return new cd00(ud00VarV, trz0Var, ravVar, suaVar, s561Var, t561Var, s900Var, ac00Var, mb00Var, unyVar, zq4VarE, kc00Var);
            case 6:
                final lc00 lc00Var3 = this.b;
                final int i2 = 0;
                final byte b5 = 2;
                final Class<lc00> cls2 = lc00.class;
                final String str3 = "eventSenderConfig";
                final String str4 = "getEventSenderConfig()Lcom/spotify/eventsender/config/MutableEventSenderConfig;";
                return new s900(lc00Var3.e, (cu71) lc00Var3.l.getValue(), lc00Var3.e(), (xk4) lc00Var3.p.getValue(), (fo80) lc00Var3.r.getValue(), (kg60) lc00Var3.q.getValue(), lc00Var3.f().a, new kc00(new den0(lc00Var3, cls2, str3, str4, i2) { // from class: p.on5
                    public final Object get() {
                        switch (b5) {
                            case 0:
                                return ((pn5) ((lyc) this).receiver).d;
                            case 1:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 2:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 3:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 4:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 5:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 6:
                                return ((lc00) ((lyc) this).receiver).c();
                            default:
                                return ((ven0) ((lyc) this).receiver).getValue();
                        }
                    }
                }, (byte) 0));
            case 7:
                return new t900(lc00Var.e());
            case 8:
                return new lb00((kb00) lc00Var.h.getValue());
            case 9:
                return new mb00((s561) lc00Var.s.getValue(), (t561) lc00Var.t.getValue(), (s900) lc00Var.u.getValue(), lc00Var.a().w(), (xk4) lc00Var.p.getValue(), lc00Var.e());
            case 10:
                return new ky30((py30) lc00Var.m.getValue(), new ly30());
            case 11:
                final lc00 lc00Var4 = this.b;
                hc00 hc00Var = new hc00(lc00Var4, (byte) 0);
                lb00 lb00Var = (lb00) lc00Var4.k.getValue();
                rav ravVar2 = (rav) lc00Var4.B.getValue();
                prz0 prz0Var = (prz0) lc00Var4.y.getValue();
                hc00 hc00Var2 = new hc00(lc00Var4, (byte) 1);
                zq4 zq4VarE2 = lc00Var4.e();
                yc9 yc9Var = (yc9) lc00Var4.G.getValue();
                lc00Var4.f().getClass();
                q8n q8nVar = lc00Var4.c;
                p8n p8nVar = q8n.b;
                final int i3 = 0;
                final byte b6 = 3;
                final Class<lc00> cls3 = lc00.class;
                final String str5 = "eventSenderConfig";
                final String str6 = "getEventSenderConfig()Lcom/spotify/eventsender/config/MutableEventSenderConfig;";
                return new td30(hc00Var, lb00Var, ravVar2, prz0Var, hc00Var2, zq4VarE2, yc9Var, w0h1.m(q8nVar.M(1)), (ac00) lc00Var4.j.getValue(), (ic00) new Runnable() { // from class: p.ic00
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b7 = b3;
                        lc00 lc00Var5 = lc00Var4;
                        switch (b7) {
                            case 0:
                                if (lc00Var5.c().e) {
                                    lc00Var5.b().a();
                                }
                                break;
                            default:
                                ((Runnable) lc00Var5.J.getValue()).run();
                                break;
                        }
                    }
                }, new kc00(new den0(lc00Var4, cls3, str5, str6, i3) { // from class: p.on5
                    public final Object get() {
                        switch (b6) {
                            case 0:
                                return ((pn5) ((lyc) this).receiver).d;
                            case 1:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 2:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 3:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 4:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 5:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 6:
                                return ((lc00) ((lyc) this).receiver).c();
                            default:
                                return ((ven0) ((lyc) this).receiver).getValue();
                        }
                    }
                }, (byte) 0), lc00Var4.d());
            case 12:
                final lc00 lc00Var5 = this.b;
                final int i4 = 0;
                final byte b7 = 4;
                final Class<lc00> cls4 = lc00.class;
                final String str7 = "eventSenderConfig";
                final String str8 = "getEventSenderConfig()Lcom/spotify/eventsender/config/MutableEventSenderConfig;";
                return new tks0(lc00Var5.e(), lc00Var5.K, (Observable) lc00Var5.a.e(Observable.just(Boolean.TRUE)), new kc00(new den0(lc00Var5, cls4, str7, str8, i4) { // from class: p.on5
                    public final Object get() {
                        switch (b7) {
                            case 0:
                                return ((pn5) ((lyc) this).receiver).d;
                            case 1:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 2:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 3:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 4:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 5:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 6:
                                return ((lc00) ((lyc) this).receiver).c();
                            default:
                                return ((ven0) ((lyc) this).receiver).getValue();
                        }
                    }
                }, (byte) 0));
            case 13:
                final lc00 lc00Var6 = this.b;
                final int i5 = 0;
                final byte b8 = 5;
                final Class<lc00> cls5 = lc00.class;
                final String str9 = "eventSenderConfig";
                final String str10 = "getEventSenderConfig()Lcom/spotify/eventsender/config/MutableEventSenderConfig;";
                return new xc00((py30) lc00Var6.m.getValue(), (s900) lc00Var6.u.getValue(), (ac00) lc00Var6.j.getValue(), Schedulers.b, lc00Var6.e(), new kc00(new den0(lc00Var6, cls5, str9, str10, i5) { // from class: p.on5
                    public final Object get() {
                        switch (b8) {
                            case 0:
                                return ((pn5) ((lyc) this).receiver).d;
                            case 1:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 2:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 3:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 4:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 5:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 6:
                                return ((lc00) ((lyc) this).receiver).c();
                            default:
                                return ((ven0) ((lyc) this).receiver).getValue();
                        }
                    }
                }, (byte) 0));
            case 14:
                final lc00 lc00Var7 = this.b;
                List listM = p7h.M(new zga[]{(cd00) lc00Var7.E.getValue(), (y680) lc00Var7.D.getValue(), (v390) lc00Var7.F.getValue(), new yuj0(lc00Var7.a().w(), (t900) lc00Var7.x.getValue())});
                idd1 idd1Var = lc00Var7.n;
                final ky30 ky30Var = (ky30) idd1Var.getValue();
                ?? r3 = new iv30() { // from class: p.jc00
                    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.eventsender.eventsender.MissingTransportException */
                    public final xfo1 a(ArrayList arrayList) throws MissingTransportException {
                        byte b9 = b3;
                        ky30 ky30Var2 = ky30Var;
                        switch (b9) {
                            case 0:
                                iy30 iy30Var = (iy30) ky30Var2.a.getLast();
                                if (iy30Var == null) {
                                    throw new MissingTransportException();
                                }
                                try {
                                    sy21 sy21VarC = iy30Var.b(ky30Var2.a(arrayList)).c();
                                    int i6 = sy21VarC.a.d;
                                    PublishEventsResponse publishEventsResponse = (PublishEventsResponse) sy21VarC.b;
                                    return (i6 != 200 || publishEventsResponse == null) ? new dj00(f4i1.c(i6, "Request failed with error code: "), 2) : new ej00(ky30.c(arrayList.size(), publishEventsResponse.o()), ky30.b(publishEventsResponse.o()));
                                } catch (Throwable th) {
                                    return new dj00(i3a.j("Request failed with exception: ", th), 2);
                                }
                            default:
                                iy30 iy30Var2 = (iy30) ky30Var2.a.getLast();
                                if (iy30Var2 == null) {
                                    throw new MissingTransportException();
                                }
                                try {
                                    sy21 sy21VarC2 = iy30Var2.a(ky30Var2.a(arrayList)).c();
                                    int i7 = sy21VarC2.a.d;
                                    PublishEventsResponse publishEventsResponse2 = (PublishEventsResponse) sy21VarC2.b;
                                    return (i7 != 200 || publishEventsResponse2 == null) ? new dj00(f4i1.c(i7, "Request failed with error code: "), 2) : new ej00(ky30.c(arrayList.size(), publishEventsResponse2.o()), ky30.b(publishEventsResponse2.o()));
                                } catch (Throwable th2) {
                                    return new dj00(i3a.j("Request failed with exception: ", th2), 2);
                                }
                        }
                    }

                    public final boolean equals(Object obj) {
                        switch (b3) {
                            case 0:
                                if ((obj instanceof jc00) && (obj instanceof iv30)) {
                                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                                }
                                return false;
                            default:
                                if ((obj instanceof jc00) && (obj instanceof iv30)) {
                                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                                }
                                return false;
                        }
                    }

                    public final cv30 getFunctionDelegate() {
                        switch (b3) {
                            case 0:
                                return new tv30(1, ky30Var, ky30.class, "publish", "publish(Ljava/util/List;)Lcom/spotify/eventsender/eventsender/EventsResponse;", 0);
                            default:
                                return new tv30(1, ky30Var, ky30.class, "publishNonAuth", "publishNonAuth(Ljava/util/List;)Lcom/spotify/eventsender/eventsender/EventsResponse;", 0);
                        }
                    }

                    public final int hashCode() {
                        switch (b3) {
                            case 0:
                                break;
                        }
                        return getFunctionDelegate().hashCode();
                    }
                };
                final ky30 ky30Var2 = (ky30) idd1Var.getValue();
                ?? r2 = new iv30() { // from class: p.jc00
                    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.eventsender.eventsender.MissingTransportException */
                    public final xfo1 a(ArrayList arrayList) throws MissingTransportException {
                        byte b9 = b2;
                        ky30 ky30Var3 = ky30Var2;
                        switch (b9) {
                            case 0:
                                iy30 iy30Var = (iy30) ky30Var3.a.getLast();
                                if (iy30Var == null) {
                                    throw new MissingTransportException();
                                }
                                try {
                                    sy21 sy21VarC = iy30Var.b(ky30Var3.a(arrayList)).c();
                                    int i6 = sy21VarC.a.d;
                                    PublishEventsResponse publishEventsResponse = (PublishEventsResponse) sy21VarC.b;
                                    return (i6 != 200 || publishEventsResponse == null) ? new dj00(f4i1.c(i6, "Request failed with error code: "), 2) : new ej00(ky30.c(arrayList.size(), publishEventsResponse.o()), ky30.b(publishEventsResponse.o()));
                                } catch (Throwable th) {
                                    return new dj00(i3a.j("Request failed with exception: ", th), 2);
                                }
                            default:
                                iy30 iy30Var2 = (iy30) ky30Var3.a.getLast();
                                if (iy30Var2 == null) {
                                    throw new MissingTransportException();
                                }
                                try {
                                    sy21 sy21VarC2 = iy30Var2.a(ky30Var3.a(arrayList)).c();
                                    int i7 = sy21VarC2.a.d;
                                    PublishEventsResponse publishEventsResponse2 = (PublishEventsResponse) sy21VarC2.b;
                                    return (i7 != 200 || publishEventsResponse2 == null) ? new dj00(f4i1.c(i7, "Request failed with error code: "), 2) : new ej00(ky30.c(arrayList.size(), publishEventsResponse2.o()), ky30.b(publishEventsResponse2.o()));
                                } catch (Throwable th2) {
                                    return new dj00(i3a.j("Request failed with exception: ", th2), 2);
                                }
                        }
                    }

                    public final boolean equals(Object obj) {
                        switch (b2) {
                            case 0:
                                if ((obj instanceof jc00) && (obj instanceof iv30)) {
                                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                                }
                                return false;
                            default:
                                if ((obj instanceof jc00) && (obj instanceof iv30)) {
                                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                                }
                                return false;
                        }
                    }

                    public final cv30 getFunctionDelegate() {
                        switch (b2) {
                            case 0:
                                return new tv30(1, ky30Var2, ky30.class, "publish", "publish(Ljava/util/List;)Lcom/spotify/eventsender/eventsender/EventsResponse;", 0);
                            default:
                                return new tv30(1, ky30Var2, ky30.class, "publishNonAuth", "publishNonAuth(Ljava/util/List;)Lcom/spotify/eventsender/eventsender/EventsResponse;", 0);
                        }
                    }

                    public final int hashCode() {
                        switch (b2) {
                            case 0:
                                break;
                        }
                        return getFunctionDelegate().hashCode();
                    }
                };
                final int i6 = 0;
                final byte b9 = 6;
                final Class<lc00> cls6 = lc00.class;
                final String str11 = "eventSenderConfig";
                final String str12 = "getEventSenderConfig()Lcom/spotify/eventsender/config/MutableEventSenderConfig;";
                return new yfa(listM, (brg) lc00Var7.I.getValue(), lc00Var7.e(), (rav) lc00Var7.B.getValue(), lc00Var7.d(), new kc00(new den0(lc00Var7, cls6, str11, str12, i6) { // from class: p.on5
                    public final Object get() {
                        switch (b9) {
                            case 0:
                                return ((pn5) ((lyc) this).receiver).d;
                            case 1:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 2:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 3:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 4:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 5:
                                return ((lc00) ((lyc) this).receiver).c();
                            case 6:
                                return ((lc00) ((lyc) this).receiver).c();
                            default:
                                return ((ven0) ((lyc) this).receiver).getValue();
                        }
                    }
                }, (byte) 0), (kb00) lc00Var7.h.getValue(), (jc00) r3, (jc00) r2);
            case 15:
                zfb0 zfb0Var = (zfb0) lc00Var.f.getValue();
                lc00Var.f().getClass();
                return new py30(zfb0Var);
            case 16:
                return new kg60(lc00Var.e);
            case 17:
                return new y680((s900) lc00Var.u.getValue(), (ac00) lc00Var.j.getValue(), (t561) lc00Var.t.getValue());
            case 18:
                lc00Var.f().getClass();
                return new adn0((Integer) null, false, false, false, false, false, z6x.a, 0, 30, 100, 128000, false, w7x.a);
            case 19:
                return new fo80((cu71) lc00Var.l.getValue(), (xk4) lc00Var.p.getValue());
            case 20:
                return new v390(lc00Var.d(), (t561) lc00Var.t.getValue(), (ac00) lc00Var.j.getValue(), (s900) lc00Var.u.getValue(), lc00Var.e());
            case 21:
                return new cu71(new nn61(lc00Var.e));
            case 22:
                return lc00Var.f().b;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new prz0(lc00Var.e());
            case 24:
                return new trz0(new xaz0(lc00Var.a().x(), (byte) 2), lc00Var.e());
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new s561((xk4) lc00Var.p.getValue(), (fo80) lc00Var.r.getValue(), new jmq(lc00Var.a().u(), (cu71) lc00Var.l.getValue()));
            case 26:
                return new t561(lc00Var.a().u());
            default:
                return new rav(lc00Var.e(), lc00Var.d(), lc00Var.d);
        }
    }
}
