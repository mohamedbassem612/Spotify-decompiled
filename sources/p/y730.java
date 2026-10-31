package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryConfig;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y730 {
    public static final tr80 b = new tr80(200, 299, 1);
    public static final long c;
    public static final YourLibraryRequest d;
    public final vwm1 a;

    static {
        ytw0 ytw0Var = jfv.b;
        c = fdg1.k0(10, ngv.e);
        gvm1 gvm1VarO = YourLibraryRequest.o();
        hvm1 hvm1VarQ = YourLibraryRequestHeader.q();
        hvm1VarQ.C(100);
        jsm1 jsm1VarR = YourLibraryConfig.YourLibraryFilters.r();
        jsm1VarR.q(ksm1.c);
        hvm1VarQ.u(jsm1VarR.build());
        qsm1 qsm1VarN = YourLibraryConfig.YourLibrarySortOrder.n();
        qsm1VarN.n(rsm1.g);
        hvm1VarQ.I(qsm1VarN.build());
        gvm1VarO.q(hvm1VarQ.build());
        d = gvm1VarO.build();
    }

    public y730(vwm1 vwm1Var) {
        this.a = vwm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        x730 x730Var;
        String uri;
        if (onmVar instanceof x730) {
            x730Var = (x730) onmVar;
            int i = x730Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x730Var.c = i - Integer.MIN_VALUE;
            } else {
                x730Var = new x730(this, onmVar);
            }
        } else {
            x730Var = new x730(this, onmVar);
        }
        Object objP = x730Var.a;
        int i2 = x730Var.c;
        long j = c;
        z730 z730Var = z730.a;
        try {
            if (i2 == 0) {
                hm5.M(objP);
                j020 j020Var = new j020(this, (lnm) null, (byte) 8);
                x730Var.c = 1;
                objP = rc2.P(j, j020Var, x730Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objP);
            }
            YourLibraryResponse yourLibraryResponse = (YourLibraryResponse) objP;
            if (yourLibraryResponse == null) {
                Logger.k("SongDNA search: followed artists did not answer within %s.", new Object[]{new jfv(j)});
                return z730Var;
            }
            tr80 tr80Var = b;
            int i3 = ((rr80) tr80Var).a;
            int i4 = ((rr80) tr80Var).b;
            int statusCode = yourLibraryResponse.getStatusCode();
            if (i3 > statusCode || statusCode > i4) {
                Logger.k("SongDNA search: followed artists answered with status %d.", new Object[]{new Integer(yourLibraryResponse.getStatusCode())});
                return z730Var;
            }
            if (yourLibraryResponse.q().r() && yourLibraryResponse.n().isEmpty()) {
                Logger.k("SongDNA search: followed artists is still loading from disk.", new Object[0]);
                return z730Var;
            }
            h290<YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity> h290VarN = yourLibraryResponse.n();
            ArrayList arrayList = new ArrayList();
            for (YourLibraryDecoratedEntityOuterClass.YourLibraryDecoratedEntity yourLibraryDecoratedEntity : h290VarN) {
                yourLibraryDecoratedEntity.getClass();
                if (yourLibraryDecoratedEntity.hasArtist()) {
                    uri = yourLibraryDecoratedEntity.e().getUri();
                    uri.getClass();
                    if (ihc1.y0(uri)) {
                        uri = null;
                    }
                } else {
                    uri = null;
                }
                if (uri != null) {
                    arrayList.add(uri);
                }
            }
            return new a830(o7h.j0(arrayList));
        } catch (Exception e) {
            op71.x(x730Var.getContext());
            Logger.l(e, "SongDNA search: the followed artists request failed.", new Object[0]);
            return z730Var;
        }
    }
}
