package p;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import app.p000rive.semantics.SemanticState;
import com.spotify.base.java.logging.Logger;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult;
import com.spotify.offline_esperanto.proto.EsOffline;
import com.spotify.player.esperanto.proto.EsProvidedTrack;
import com.spotify.player.esperanto.proto.EsQueue;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import spotify.collection.esperanto.proto.CollectionContainsResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pbo1 implements Function, Predicate, s2i1, c0g, BiFunction, e761 {
    public final /* synthetic */ byte a;
    public static final pbo1 b = new pbo1(1);
    public static final pbo1 c = new pbo1(2);
    public static final pbo1 d = new pbo1(3);
    public static final pbo1 e = new pbo1(5);
    public static final pbo1 f = new pbo1(6);
    public static final pbo1 g = new pbo1(7);
    public static final pbo1 h = new pbo1(8);
    public static final pbo1 i = new pbo1(9);
    public static final pbo1 t = new pbo1(10);
    public static final pbo1 X = new pbo1(11);
    public static final pbo1 Y = new pbo1(12);
    public static final pbo1 Z = new pbo1(13);
    public static final pbo1 N0 = new pbo1(14);
    public static final pbo1 O0 = new pbo1(15);
    public static final pbo1 P0 = new pbo1(16);
    public static final pbo1 Q0 = new pbo1(17);
    public static final pbo1 R0 = new pbo1(18);
    public static final pbo1 S0 = new pbo1(19);
    public static final pbo1 T0 = new pbo1(20);
    public static final pbo1 U0 = new pbo1(21);
    public static final pbo1 V0 = new pbo1(22);
    public static final pbo1 W0 = new pbo1(23);
    public static final pbo1 X0 = new pbo1(24);
    public static final pbo1 Y0 = new pbo1(25);
    public static final pbo1 Z0 = new pbo1(26);
    public static final pbo1 a1 = new pbo1(27);
    public static final pbo1 b1 = new pbo1(28);
    public static final pbo1 c1 = new pbo1(29);

    public /* synthetic */ pbo1(byte b2) {
        this.a = b2;
    }

    public static boolean f(m0s0 m0s0Var) {
        return m0s0Var.a();
    }

    public Object a() {
        return w7x.a;
    }

    public Object apply(Object obj) {
        List arrayList;
        byte b2 = this.a;
        List list = z6x.a;
        switch (b2) {
            case 2:
                return new g8o0((Throwable) obj, (bk8) null);
            case 3:
                return rih1.a;
            case 4:
            case 7:
            case 10:
            case 11:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
            case 24:
            default:
                oy21 oy21Var = (py21) obj;
                if (!(oy21Var instanceof ly21)) {
                    if (!(oy21Var instanceof oy21)) {
                        eg.o();
                        return null;
                    }
                    list = (List) oy21Var.a;
                }
                return list;
            case 5:
                return Boolean.valueOf(((k791) obj) instanceof j791);
            case 6:
                String str = (String) ((cxc0) obj).f.q.get("artistGid");
                return str == null ? "" : str;
            case 8:
                byte[] bArr = (byte[]) obj;
                try {
                    return EsAuthStorageResult.AuthStorageResult.p(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult.AuthStorageResult: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 9:
                Logger.e((Throwable) obj, "Failed to observe Session Server Time.", new Object[0]);
                return Observable.just(iv8.b);
            case 12:
                return (p510) ((l510) obj).a.get(0);
            case 13:
                String strUri = ((ContextTrack) ((PlayerState) obj).track().b()).uri();
                blc0[] blc0VarArr = pnd.Z;
                Set set = s4b1.f;
                return new mmr0(Boolean.valueOf(f46.M(blc0VarArr, uic.x(strUri).c)), strUri);
            case 15:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return CollectionContainsResponse.r(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.collection.esperanto.proto.CollectionContainsResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 18:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return EsResponseWithReasons.ResponseWithReasons.p(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.player.esperanto.proto.EsResponseWithReasons.ResponseWithReasons: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
            case 21:
                return new e331(new m231((Throwable) obj));
            case 22:
                return ((nnr) ((spq0) obj).b()).B.a;
            case 23:
                List listB = ((uv00) obj).b(gh3.class);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    gh3 gh3Var = ((tv00) it.next()).b;
                    if (gh3Var != null) {
                        ArrayList arrayList3 = gh3Var.g;
                        arrayList = new ArrayList();
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            r7h.W(((fh3) it2.next()).a, arrayList);
                        }
                    } else {
                        arrayList = list;
                    }
                    r7h.W(arrayList, arrayList2);
                }
                return arrayList2;
            case 25:
                return Integer.valueOf(((EsOffline.GetContextsResponse) obj).o());
            case 26:
                return t3p1.D((nwq0) obj);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new c5z((ir61) obj);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                EsQueue.Queue queue = (EsQueue.Queue) obj;
                PlayerQueue.Builder builder = PlayerQueue.builder();
                builder.revision(String.valueOf(queue.s()));
                if (queue.u()) {
                    builder.track(xlm.a(queue.t()));
                }
                if (queue.o() > 0) {
                    h290 h290VarP = queue.p();
                    ArrayList arrayList4 = new ArrayList(q7h.U(h290VarP, 10));
                    Iterator it3 = h290VarP.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(xlm.a((EsProvidedTrack.ProvidedTrack) it3.next()));
                    }
                    builder.nextTracks(b380.p(arrayList4));
                }
                if (queue.q() > 0) {
                    h290 h290VarR = queue.r();
                    ArrayList arrayList5 = new ArrayList(q7h.U(h290VarR, 10));
                    Iterator it4 = h290VarR.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(xlm.a((EsProvidedTrack.ProvidedTrack) it4.next()));
                    }
                    builder.prevTracks(b380.p(arrayList5));
                }
                return builder.build();
        }
    }

    public Object b(FileInputStream fileInputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, nne.a), SemanticState.Multiline);
        try {
            Set setM0 = z561.m0(z561.T(zlt.b1, z561.R(new hjc0(bufferedReader))));
            bufferedReader.close();
            return setM0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(bufferedReader, th);
                throw th2;
            }
        }
    }

    public void c(Object obj, v091 v091Var) throws IOException {
        Set set = (Set) obj;
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter((OutputStream) v091Var, nne.a), SemanticState.Multiline);
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                bufferedWriter.write((String) it.next());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(bufferedWriter, th);
                throw th2;
            }
        }
    }

    public void d(j5o j5oVar, af10 af10Var, iu30 iu30Var, ly2 ly2Var, iu30 iu30Var2, b0k b0kVar, int i2) {
        int i3;
        h311 h311VarV;
        k5o k5oVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1023882724);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(j5oVar) : x340Var.i(j5oVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(af10Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(ly2Var) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(iu30Var2) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            if (j5oVar instanceof i5o) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    k5oVar = new k5o(this, j5oVar, af10Var, iu30Var, ly2Var, iu30Var2, i2, (byte) 0);
                }
            } else {
                ven0 ven0VarZ = cxm.z(x340Var);
                p6p1.h(48, apo.r(-2101596427, new ta5((Context) x340Var.k(AndroidCompositionLocals_androidKt.b), j5oVar, iu30Var, af10Var, iu30Var2, ven0VarZ, ly2Var, (byte) 12), x340Var), x340Var, u291.f(nim0.a, 1.0f));
            }
            h311VarV.d = k5oVar;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            k5oVar = new k5o(this, j5oVar, af10Var, iu30Var, ly2Var, iu30Var2, i2, (byte) 1);
            h311VarV.d = k5oVar;
        }
    }

    public mr20 e(boolean z) {
        return new huz(Boolean.TRUE, (byte) 10);
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new kab(xkg0Var, str2, str);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 7:
                return !((uv00) obj).f;
            case 10:
                return ((spq0) obj).c();
            default:
                return !((uv00) obj).f;
        }
    }

    public Object apply(Object obj, Object obj2) {
        return new lcl(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
    }
}
