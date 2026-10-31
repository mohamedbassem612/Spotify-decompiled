package p;

import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kum1 implements Function, agp1, adp1, jgg1 {
    public static final /* synthetic */ kum1 b = new kum1((byte) 1);
    public static final /* synthetic */ kum1 c = new kum1((byte) 2);
    public final /* synthetic */ byte a;

    public kum1(i2i1 i2i1Var) {
        this.a = (byte) 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    public Object apply(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                h290<YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity> h290VarN = ((YourLibraryResponse) obj).n();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarN, 10));
                for (YourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity : h290VarN) {
                    String uri = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getUri();
                    String name = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getName();
                    if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.s() == gtm1.a) {
                        i = 2;
                    } else {
                        gtm1 gtm1VarS = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.s();
                        gtm1 gtm1Var = gtm1.c;
                        if (gtm1VarS == gtm1Var) {
                            String uri2 = yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.e().getUri();
                            if (uri2.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || uri2.equals("spotify:collection:tracks") || uri2.equals("spotify:internal:collection:tracks") || (nhc1.Y(uri2, "spotify:user:", false) && nhc1.R(uri2, ":collection", false))) {
                                i = 3;
                            } else if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.s() == gtm1Var) {
                                i = 1;
                            } else {
                                i = 4;
                            }
                        } else if (yourLibraryDecoratedEntityOuterClass$YourLibraryDecoratedEntity.s() == gtm1Var) {
                            i = 1;
                        } else {
                            i = 4;
                        }
                    }
                    arrayList.add(new rsp0(i, uri, name));
                }
                return arrayList;
            default:
                return (byte[]) obj;
        }
    }

    public /* synthetic */ kap1 f(pno1 pno1Var, a2x0 a2x0Var) {
        return wfn1.a((rbn1) pno1Var, a2x0Var);
    }

    public /* synthetic */ kum1(byte b2) {
        this.a = b2;
    }
}
