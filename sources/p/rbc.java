package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import com.spotify.collection_esperanto.proto.Status;
import com.spotify.connect.esperanto.proto.VolumeMessages;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.premiumdestinationbadge.v1.BadgeResponse;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableCreate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import spotify.collection.esperanto.proto.CollectionDecorateResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rbc implements t2n, Predicate, BiFunction, Function, Init, s6t0, hiy, x800 {
    public final /* synthetic */ byte a;
    public static final rbc b = new rbc(0);
    public static final rbc c = new rbc(1);
    public static final rbc d = new rbc(2);
    public static final rbc e = new rbc(3);
    public static final rbc f = new rbc(4);
    public static final rbc g = new rbc(5);
    public static final rbc h = new rbc(6);
    public static final rbc i = new rbc(7);
    public static final rbc t = new rbc(8);
    public static final rbc X = new rbc(9);
    public static final rbc Y = new rbc(10);
    public static final rbc Z = new rbc(11);
    public static final rbc N0 = new rbc(12);
    public static final rbc O0 = new rbc(13);
    public static final rbc P0 = new rbc(14);
    public static final rbc Q0 = new rbc(15);
    public static final rbc R0 = new rbc(16);
    public static final rbc S0 = new rbc(17);
    public static final rbc T0 = new rbc(18);
    public static final rbc U0 = new rbc(19);
    public static final rbc V0 = new rbc(20);
    public static final rbc W0 = new rbc(21);
    public static final rbc X0 = new rbc(22);
    public static final rbc Y0 = new rbc(23);
    public static final rbc Z0 = new rbc(24);
    public static final rbc a1 = new rbc(25);
    public static final rbc b1 = new rbc(26);
    public static final rbc c1 = new rbc(27);
    public static final rbc d1 = new rbc(28);
    public static final rbc e1 = new rbc(29);

    public /* synthetic */ rbc(byte b2) {
        this.a = b2;
    }

    public r6t0 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new tau(context, layoutInflater, viewGroup);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                return Observable.empty();
            case 4:
                return cm2.a;
            case 5:
            case 12:
            case 13:
            case 14:
            case 17:
            default:
                return (eww0) ((spq0) obj).b();
            case 6:
                spq0 spq0Var = (spq0) obj;
                return Boolean.valueOf(!spq0Var.c() || ((l0l) spq0Var.b()).getType() == f0u.Z);
            case 7:
                List<vy6> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (vy6 vy6Var : list) {
                    arrayList.add(new ss6(vy6Var.a, vy6Var.b, vy6Var.c.b));
                }
                return arrayList;
            case 8:
                ifl1 ifl1Var = new ifl1((w28) obj, (byte) 6);
                int i2 = Flowable.a;
                return new FlowableCreate(ifl1Var, BackpressureStrategy.c);
            case 9:
                return Boolean.valueOf(((Map) obj).containsValue(Boolean.TRUE));
            case 10:
                return r49.a;
            case 11:
                BadgeResponse badgeResponse = (BadgeResponse) obj;
                return new l1a(badgeResponse.o(), badgeResponse.n());
            case 15:
                return new x6g((SubmitCheckoutResponse) obj);
            case 16:
                byte[] bArr = (byte[]) obj;
                try {
                    return CollectionDecorateResponse.u(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionDecorateResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 18:
                EsOffline.Item item = (EsOffline.Item) o7h.s0(((EsOffline.GetItemsResponse) obj).getItemsList());
                cpz cpzVarP = item != null ? item.p() : null;
                switch (cpzVarP == null ? -1 : mql.a[cpzVarP.ordinal()]) {
                    case 1:
                        return lwp0.a;
                    case 2:
                        return hwp0.a;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new jwp0(0);
                    default:
                        return rwp0.a;
                }
            case 19:
                return Boolean.valueOf(((feh) obj) instanceof ceh);
            case 20:
                return Boolean.valueOf(!yto.k((String) obj, true));
            case 21:
                return Integer.valueOf(((Status) obj).n());
            case 22:
                return ((tr3) obj).b.a.d;
            case 23:
                VolumeMessages.VolumeResponse volumeResponse = (VolumeMessages.VolumeResponse) obj;
                return new l0u(Double.valueOf(((double) volumeResponse.q()) / 65535.0d), volumeResponse.o());
        }
    }

    public First e0(Object obj) {
        switch (this.a) {
            case 5:
                bw3 bw3Var = (cw3) obj;
                return bw3Var instanceof bw3 ? First.c(bw3Var, Collections.singleton(new tu3(bw3Var.a))) : First.b(bw3Var);
            case 12:
                return First.b((geb) obj);
            case 17:
                gok gokVar = (gok) obj;
                return First.c(gokVar, Collections.singleton(new emk(gokVar.a())));
            default:
                return First.b((qwv) obj);
        }
    }

    public Object g(Object obj) {
        switch (this.a) {
            case 0:
                return obj.toString();
            default:
                ((uz21) obj).close();
                return null;
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 1:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            default:
                b8z b8zVar = (b8z) obj;
                return (b8zVar instanceof a8z) && ((a8z) b8zVar).b;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new mmr0((l62) obj, (Long) obj2);
    }
}
