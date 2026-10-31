package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ny50 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oy50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny50(oy50 oy50Var, byte b) {
        super(1);
        this.a = b;
        this.b = oy50Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        oy50 oy50Var = this.b;
        switch (b) {
            case 0:
                return b3o1.B(oy50Var.o, oy50Var.m);
            case 1:
                String str = oy50Var.o;
                return new wcm(str, str, (String) null, tcm.a, (Function0) null, (Function0) null, false, (String) null, (String) null, 1012);
            case 2:
                return new yjm0(oy50Var.o);
            case 3:
                return b3o1.B(oy50Var.o, oy50Var.m);
            case 4:
                return b3o1.B(oy50Var.o, oy50Var.m);
            case 5:
                return new xc6(oy50Var.o);
            case 6:
                return new p330(oy50Var.o);
            case 7:
                String str2 = oy50Var.o;
                return new wcm(str2, str2, (String) null, (ucm) null, (Function0) null, (Function0) null, false, (String) null, (String) null, 1020);
            case 8:
                return new t671(54, oy50Var.o, (String) null, (String) null, "AuthorPageHeader", (List) null, false);
            case 9:
                return new t671(54, oy50Var.o, (String) null, (String) null, "ArtistPageHeader", (List) null, false);
            case 10:
                return new qet0(oy50Var.o, false, false, (pet0) null, 30);
            case 11:
                return new mgy(oy50Var.o);
            case 12:
                return new ve81(oy50Var.n);
            default:
                return new yjm0(oy50Var.o);
        }
    }
}
