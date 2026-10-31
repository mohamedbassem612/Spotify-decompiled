package p;

import android.companion.virtual.VirtualDevice;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.components.DependencyException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import kotlinx.serialization.protobuf.internal.ProtobufDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class nkx0 implements hc10, Predicate, BiFunction, Function, k2t, yg30, hv30 {
    public final /* synthetic */ byte a;

    public /* synthetic */ nkx0(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ VirtualDevice d(Object obj) {
        return (VirtualDevice) obj;
    }

    public static /* synthetic */ void e(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append((Object) " is not supported titleResId");
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.protobuf.internal.ProtobufDecodingException */
    public static /* synthetic */ void h(int i, Object obj, Throwable th) throws ProtobufDecodingException {
        throw new ProtobufDecodingException("Error while decoding proto number " + i + ((Object) " of ") + obj, th);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new NoSuchElementException(str + obj);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.protobuf.internal.ProtobufDecodingException */
    public static /* synthetic */ void k(Object obj, StringBuilder sb) throws ProtobufDecodingException {
        sb.append(", but found ");
        sb.append(obj);
        throw new ProtobufDecodingException(sb.toString(), null);
    }

    public static /* synthetic */ void l(String str, int i, Object obj) {
        throw new IllegalArgumentException(str + i + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(String str, Object obj, int i) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.firebase.components.DependencyException */
    public static /* synthetic */ void n(String str, Object obj, Object obj2) throws DependencyException {
        throw new DependencyException(str + obj + obj2);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, int i) {
        throw new IllegalArgumentException((str + obj + obj2 + i).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static /* synthetic */ void q(Object obj, String str) throws InvalidProtocolBufferException {
        throw new InvalidProtocolBufferException(str + obj);
    }

    public static /* synthetic */ void r(Object obj, StringBuilder sb) {
        sb.append(", ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }

    public Object a(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                pbt pbtVar = (pbt) obj2;
                ((qop) obj).getClass();
                pbtVar.getClass();
                return new uqg(pbtVar.a, (byte) 5);
            case 2:
                bct bctVar = (bct) obj2;
                ((qop) obj).getClass();
                bctVar.getClass();
                return new g73(bctVar.d, (blq) iy81.a(new fyo((byte) 26)).get());
            default:
                ((c8c0) obj).getClass();
                ((izu0) obj2).getClass();
                return new ic3((byte) 8);
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 12:
                return (PlayerState) ((Optional) obj).get();
            case 13:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                String strContextUri = playerState.contextUri();
                j380 j380VarMetadata = contextTrack.metadata();
                String strA0 = l4o1.a0(contextTrack, "image_url");
                Uri uri = strA0 == null ? Uri.EMPTY : Uri.parse(strA0);
                String strUri = contextTrack.uri();
                Uri uri2 = Uri.EMPTY;
                return new z310(Collections.singletonList(new u310(strUri, (String) null, (String) j380VarMetadata.get("title"), l4o1.l(contextTrack), uri, (Uri) null, uri2, uri2, uri2, (Uri) null, (Uri) null, 1, false, l4o1.K(contextTrack), false, false, 3, 4, (Double) null, (Integer) null, (Integer) null, false, (String) null, strContextUri, (Integer) null, 0, (y310) null, (String) null, (Long) null, (String) null, (Map) null, (String) null, (String) null, (oz0) null, 1073741856, 12)), (f410) null, (m510) null, (String) null);
            case 24:
                return null;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return (String) ((spq0) obj).b();
            default:
                List list = ((zoz0) obj).b;
                return (list == null || list.isEmpty()) ? j5.a : spq0.a((String) ((Map) list.get(0)).get("uri"));
        }
    }

    public void b(lly0 lly0Var) {
        lly0Var.get().getClass();
        throw new ClassCastException();
    }

    public void f(zf30 zf30Var) {
        ((kk21) zf30Var).getClass();
    }

    @Override // p.hc10
    public ec10[] g() {
        return new ec10[]{new dmy0()};
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 9:
                return ((PlayerState) obj).track().c();
            case 11:
                return ((Optional) obj).isPresent();
            case 21:
                return ((Boolean) obj).booleanValue();
            default:
                return ((spq0) obj).c();
        }
    }

    public Object apply(Object obj, Object obj2) {
        return ((Boolean) obj2).booleanValue() ? Optional.empty() : Optional.of((PlayerState) obj);
    }
}
