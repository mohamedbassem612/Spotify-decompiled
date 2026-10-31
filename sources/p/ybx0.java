package p;

import android.os.Parcelable;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.puffin_esperanto.proto.PuffinProcessingCompatibilityOuterClass;
import com.spotify.stream_reporting_esperanto.proto.StreamStartResponseOuterClass;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableNever;
import j$.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import spotify.your_library_tags_esperanto.proto.YourLibraryTagsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ybx0 implements iar0, Function, Predicate, BiFunction, t2n, Function3, com.spotify.mobius.functions.BiFunction, s2i1, Init {
    public final /* synthetic */ byte a;
    public static final ybx0 b = new ybx0(0);
    public static final ybx0 c = new ybx0(1);
    public static final ybx0 d = new ybx0(2);
    public static final ybx0 e = new ybx0(3);
    public static final ybx0 f = new ybx0(4);
    public static final ybx0 g = new ybx0(5);
    public static final ybx0 h = new ybx0(6);
    public static final ybx0 i = new ybx0(7);
    public static final ybx0 t = new ybx0(8);
    public static final ybx0 X = new ybx0(9);
    public static final ybx0 Y = new ybx0(10);
    public static final ybx0 Z = new ybx0(11);
    public static final ybx0 N0 = new ybx0(12);
    public static final ybx0 O0 = new ybx0(13);
    public static final ybx0 P0 = new ybx0(14);
    public static final ybx0 Q0 = new ybx0(15);
    public static final ybx0 R0 = new ybx0(16);
    public static final ybx0 S0 = new ybx0(17);
    public static final ybx0 T0 = new ybx0(18);
    public static final ybx0 U0 = new ybx0(19);
    public static final ybx0 V0 = new ybx0(20);
    public static final ybx0 W0 = new ybx0(21);
    public static final ybx0 X0 = new ybx0(22);
    public static final ybx0 Y0 = new ybx0(23);
    public static final ybx0 Z0 = new ybx0(24);
    public static final ybx0 a1 = new ybx0(25);
    public static final ybx0 b1 = new ybx0(26);

    public /* synthetic */ ybx0(byte b2) {
        this.a = b2;
    }

    public Parcelable a(s4b1 s4b1Var, th61 th61Var) {
        String strZ = s4b1Var.z();
        strZ.getClass();
        return new sbx0(strZ, th61Var.a);
    }

    public Object apply(Object obj) {
        Boolean boolValueOf;
        switch (this.a) {
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return PuffinProcessingCompatibilityOuterClass.PuffinProcessingCompatibility.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.puffin_esperanto.proto.PuffinProcessingCompatibilityOuterClass.PuffinProcessingCompatibility: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 2:
                ly21 ly21Var = (py21) obj;
                if (ly21Var instanceof oy21) {
                    return new ceh();
                }
                if (ly21Var instanceof ly21) {
                    return new beh(ly21Var.a.b());
                }
                eg.o();
                return null;
            case 3:
            case 4:
            case 7:
            case 9:
            case 11:
            case 12:
            case 14:
            case 19:
            case 20:
            default:
                spq0 spq0Var = (spq0) obj;
                SeekToCommand.Builder builder = SeekToCommand.builder(15000L);
                CommandOptions.Builder builder2 = CommandOptions.builder();
                if (spq0Var.c()) {
                    builder2.onlyForPlaybackId((String) spq0Var.b());
                }
                return new j9u0(builder.options(builder2.build()).relative(SeekToCommand.Relative.CURRENT).build());
            case 5:
                return new gi21(((Boolean) obj).booleanValue());
            case 6:
                return (oq3) obj;
            case 8:
                return (ContextTrack) ((spq0) obj).b();
            case 10:
                List list = (List) ((Map) obj).get("followedShows");
                return list != null ? o7h.a1(list, pap1.s(new iu30[]{rz71.T0, rz71.U0})) : z6x.a;
            case 13:
                oy21 oy21Var = (py21) obj;
                if (oy21Var instanceof ly21) {
                    boolValueOf = Boolean.FALSE;
                } else {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    boolValueOf = Boolean.valueOf(!((wsc0) oy21Var.a).f.w.b);
                }
                return boolValueOf;
            case 15:
                int i2 = Flowable.a;
                return FlowableNever.b;
            case 16:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return StreamStartResponseOuterClass.StreamStartResponse.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StreamStartResponseOuterClass.StreamStartResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 17:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Transport unavailable";
                }
                return new y0f1(message);
            case 18:
                return ((ContextTrack) ((PlayerState) obj).track().b()).uri();
            case 21:
                return Boolean.valueOf(((gbl) obj).b);
            case 22:
                nsk1 nsk1Var = (nsk1) obj;
                iu30 iu30Var = nsk1Var.a.d;
                if (iu30Var != null) {
                    Double d2 = nsk1Var.d;
                    iu30Var.invoke(Double.valueOf(d2 != null ? d2.doubleValue() : nsk1Var.c));
                }
                return nsk1Var;
            case 23:
                return rih1.a;
            case 24:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return YourLibraryTagsResponse.p(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.your_library_tags_esperanto.proto.YourLibraryTagsResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
        }
    }

    public void b(Function0 function0, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(216971185);
        int i3 = (x340Var.i(function0) ? 4 : 2) | i2;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            foo1.c(new gbx(z50.c, function0), ldx.c, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, pij.a, x340Var, 0, 48, 2044);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(this, function0, i2, (byte) 13);
        }
    }

    public void c(b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(256677629);
        int i3 = i2 & 1;
        if (x340Var.Y(i3, i3 != 0)) {
            w0h1.a(wsx.c, isl.a, (qim0) null, 0L, 0L, false, x340Var, wsx.d | 48, 60);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dj71(this, i2, (byte) 22);
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 20:
                return First.b((whi1) obj);
            default:
                return First.b((aa9) obj);
        }
    }

    public Object g(Object obj) {
        return Boolean.valueOf(((uz21) obj).f());
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new heg1(xkg0Var, str2, str);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        return new eq61(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue());
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 3:
                return !((uv00) obj).f;
            default:
                return ((spq0) obj).c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                return new mmr0((fvf1) obj, (Boolean) obj2);
            default:
                return qq81.a((qq81) obj, null, (nxw) obj2, null, null, null, null, false, null, null, 0, null, 16381);
        }
    }
}
