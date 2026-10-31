package p;

import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;
import com.spotify.accessory.statemanager.AccessoryStateManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.marquee.marquee.events.proto.MarqueeUserHoldoutEvent;
import com.spotify.messages.ListeningPartyPlayedMusicTrack;
import com.spotify.offline.NativeForegroundObserver;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.PlayerState;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dy40 implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ dy40(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        qi accessory;
        boolean z;
        ny51Var = null;
        ny51 ny51Var = null;
        switch (this.a) {
            case 0:
                g9r g9rVar = (g9r) this.b;
                AccessoryStateManager.Event event = (AccessoryStateManager.Event) ((spq0) obj).h();
                if (event != null) {
                    if (((event instanceof AccessoryStateManager.Event.Connected) || (event instanceof AccessoryStateManager.Event.Updated)) && (accessory = event.getAccessory()) != null) {
                        qi qiVar = accessory;
                        cn70 cn70Var = qiVar.i;
                        if (!qiVar.f.contains("spotify-tap") || u890.j(qiVar.g, Boolean.FALSE)) {
                            return;
                        }
                        String strG = g9r.g(cn70Var.a());
                        Logger.b("Go: Device connected: name=%s, accessory.address=%s, bluetooth.address=%s", new Object[]{qiVar.b, cn70Var.a(), strG});
                        ((w961) g9r.d(g9rVar)).a(g9r.b(g9rVar), g9rVar.f(strG));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((x350) this.b).d((psd0) obj);
                return;
            case 2:
                h280.a((h280) this.b, (i280) obj);
                return;
            case 3:
                ((qd9) this.b).a(((c3a0) obj).a);
                return;
            case 4:
                txt0 txt0Var = (txt0) obj;
                t2j0 t2j0Var = ((hr0) this.b).a;
                tkd0 tkd0VarN = ListeningPartyPlayedMusicTrack.n();
                tkd0VarN.u(txt0Var.a.toString());
                tkd0VarN.w(txt0Var.b.toString());
                y6b1 y6b1Var = txt0Var.c;
                if (y6b1Var != null) {
                    tkd0VarN.r(y6b1Var.toString());
                }
                tkd0VarN.t(txt0Var.g);
                Long l = txt0Var.h;
                if (l != null) {
                    tkd0VarN.n(l.longValue());
                }
                tkd0VarN.v(txt0Var.d);
                tkd0VarN.q(txt0Var.e);
                tkd0VarN.s(o7h.y0(txt0Var.f, ",", null, null, tue0.a, 30));
                tkd0VarN.x(txt0Var.i);
                t2j0Var.a(tkd0VarN.build());
                return;
            case 5:
                sug0 sug0Var = (sug0) this.b;
                ji0 ji0Var = ((vwg0) obj).c.c;
                sug0Var.d = ji0Var;
                String strA = hcx0.a(ji0Var);
                sug0Var.c = false;
                ixg ixgVarF = sug0Var.a.f(strA);
                sug0Var.e = ixgVarF;
                ixgVarF.r("marquee_album_art_tag");
                ixgVarF.j(sug0Var);
                return;
            case 6:
                ywg0 ywg0Var = (ywg0) obj;
                List listQ0 = ihc1.Q0(ywg0Var.e, new String[]{","}, 0, 6);
                dyg0 dyg0VarO = MarqueeUserHoldoutEvent.o();
                dyg0VarO.r("user_in_holdout_invisible_impression");
                dyg0VarO.s(ywg0Var.c);
                dyg0VarO.q(ywg0Var.d);
                dyg0VarO.n(listQ0);
                MarqueeUserHoldoutEvent marqueeUserHoldoutEventBuild = dyg0VarO.build();
                t2j0 t2j0Var2 = (t2j0) this.b;
                marqueeUserHoldoutEventBuild.getClass();
                t2j0Var2.a(marqueeUserHoldoutEventBuild);
                return;
            case 7:
                Logger.e((Throwable) obj, "Couldn't create a radio station for %s", new Object[]{(String) this.b});
                return;
            case 8:
                ((hjh0) this.b).X = (PlayerState) obj;
                return;
            case 9:
                PlayerState playerState = (PlayerState) obj;
                inh0 inh0Var = (inh0) this.b;
                AudioStream audioStream = inh0Var.f;
                if (playerState.audioStream() != null && playerState.isPlaying() && !playerState.isPaused()) {
                    audioStream = playerState.audioStream();
                    audioStream.getClass();
                }
                enh0 enh0Var = inh0Var.g;
                spq0 spq0VarI = playerState.track().i(wrh.c);
                Set set = s4b1.f;
                enh0 enh0Var2 = (enh0) spq0VarI.i(new bx8()).i(new bx8(inh0Var)).e(enh0Var);
                if (audioStream == inh0Var.f && enh0Var2 == inh0Var.g) {
                    return;
                }
                inh0Var.f = audioStream;
                inh0Var.g = enh0Var2;
                yfu yfuVar = inh0Var.b.f;
                synchronized (yfuVar.b) {
                    z = ((xx20) yfuVar.c).a;
                }
                if (z) {
                    fnh0 fnh0Var = inh0Var.b;
                    fnh0Var.g.u(new kz20(true, inh0Var.f, inh0Var.g, 2));
                    jnh0 jnh0Var = fnh0Var.c;
                    Handler handler = jnh0Var.b;
                    if (handler != null) {
                        handler.post(new unc0(fnh0Var.a, fnh0Var.h, fnh0Var.g, fnh0Var.f, fnh0Var.b, jnh0Var, fnh0Var.e, (byte) 1));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                k0u k0uVar = (k0u) ((spq0) obj).h();
                if (k0uVar != null) {
                    x6m0 x6m0Var = (x6m0) this.b;
                    x6m0Var.d.onNext(new ix5(k0uVar.a, false, k0uVar.b, x6m0Var.c(), "connect_volume_updates", x6m0Var.d()));
                    return;
                }
                return;
            case 11:
                ((NativeForegroundObserver) this.b).onForeground(((Boolean) obj).booleanValue());
                return;
            case 12:
                buo0 buo0Var = (buo0) obj;
                ((jut) this.b).j(buo0Var.a, buo0Var.b);
                return;
            case 13:
                ((r0z0) g9r.c((g9r) this.b).get()).cancel();
                return;
            case 14:
                km0.e((km0) this.b).getSharedPreferences("com.spotify.oops", 0).edit().putBoolean("ObservabilityPlatformEnabledFromRCProperty", ((Boolean) obj).booleanValue()).apply();
                return;
            case 15:
                ((com.spotify.mobius.functions.Consumer) this.b).accept((fiw) obj);
                return;
            case 16:
                vf2.a((vf2) this.b).onNext((g0u0) obj);
                return;
            case 17:
                ((sdx0) this.b).j.onNext(Boolean.FALSE);
                utw0 utw0Var = ike1.a;
                utw0Var.y("ProfileSectionCoordinator");
                utw0Var.s((Throwable) obj, "Editor detection failed, keeping non-editor layout", new Object[0]);
                return;
            case 18:
                fmy0 fmy0Var = (fmy0) this.b;
                Object obj2 = ((e331) obj).a;
                ika1 ika1Var = (ouk) (obj2 instanceof m231 ? null : obj2);
                if (ika1Var instanceof hka1) {
                    ConfigurationResponse configurationResponse = ((hka1) ika1Var).a;
                    List listL1 = o7h.l1(o7h.j1(configurationResponse.o()));
                    int iS = zno1.s(q7h.U(listL1, 10));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                    for (Object obj3 : listL1) {
                        linkedHashMap.put(obj3, Boolean.TRUE);
                    }
                    fmy0Var.b.e(new nm10(linkedHashMap, false));
                    fmy0Var.f.a(configurationResponse.r());
                    return;
                }
                if (ika1Var instanceof ika1) {
                    List listL2 = o7h.l1(o7h.j1(ika1Var.a().o()));
                    int iS2 = zno1.s(q7h.U(listL2, 10));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iS2 >= 16 ? iS2 : 16);
                    for (Object obj4 : listL2) {
                        linkedHashMap2.put(obj4, Boolean.TRUE);
                    }
                    fmy0Var.b.e(new nm10(linkedHashMap2, true));
                    fmy0Var.f.a("-1");
                    return;
                }
                if (!(ika1Var instanceof nka1)) {
                    if (ika1Var == null) {
                        return;
                    }
                    eg.o();
                    return;
                }
                List listL3 = o7h.l1(o7h.j1(((nka1) ika1Var).a().o()));
                int iS3 = zno1.s(q7h.U(listL3, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS3 >= 16 ? iS3 : 16);
                for (Object obj5 : listL3) {
                    linkedHashMap3.put(obj5, Boolean.TRUE);
                }
                fmy0Var.b.e(new om10(linkedHashMap3));
                fmy0Var.f.a("-1");
                return;
            case 19:
                trz0 trz0Var = (trz0) this.b;
                trz0.b(trz0Var).a();
                trz0.a(trz0Var).putAll((Map) obj);
                return;
            case 20:
                g020 g020Var = (g020) obj;
                Logger.g("RC Unauthenticated Properties FetchResult=".concat(g020Var.a()), new Object[0]);
                ((vz11) this.b).g.onNext(i6p1.f(g020Var));
                return;
            case 21:
                ((n4f0) ((kly0) this.b).get()).c(yg8.f, 0);
                return;
            case 22:
                hkt0 hkt0Var = (hkt0) obj;
                ha61 ha61Var = (ha61) this.b;
                if (ha61.d(ha61Var).y()) {
                    Toast.makeText(ha61.a(ha61Var), String.format("Received Go command from %s (%s)", Arrays.copyOf(new Object[]{hkt0Var.b(), hkt0Var.e()}, 2)), 0).show();
                    return;
                }
                return;
            case 23:
                xj91 xj91Var = (xj91) obj;
                rig rigVarA = ((jj91) this.b).a(xj91Var.a);
                if (rigVarA != null) {
                    rigVarA.c.onNext(new ql91(xj91Var.b));
                    return;
                }
                return;
            case 24:
                ((c6b1) this.b).a.sendBroadcast(new Intent("com.spotify.music.active"));
                return;
            case 25:
                yvg1 yvg1Var = (yvg1) obj;
                bkb1 bkb1Var = (bkb1) this.b;
                boolean zBooleanValue = ((Boolean) yvg1Var.a).booleanValue();
                th61 th61Var = (th61) yvg1Var.b;
                String str = (String) yvg1Var.c;
                if (zBooleanValue && th61Var != null) {
                    ny51Var = new ny51(th61Var, bkb1Var, str, (byte) 23);
                }
                bkb1Var.a.Z0(zBooleanValue, ny51Var);
                return;
            case 26:
                tp7.d((tp7) this.b).a(2, String.valueOf(((Boolean) obj).booleanValue()));
                return;
            case 27:
                ((a820) this.b).c = ((Boolean) obj).booleanValue();
                return;
            case 28:
                g9r.e((g9r) this.b, (vpu) obj);
                return;
            default:
                ((Observer) this.b).onNext((spq0) obj);
                return;
        }
    }
}
