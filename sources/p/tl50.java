package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class tl50 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pd71 a;
    public final /* synthetic */ jjz b;
    public final /* synthetic */ bfd c;
    public final /* synthetic */ r35 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ kt91 i;

    public tl50(pd71 pd71Var, jjz jjzVar, bfd bfdVar, r35 r35Var, Context context, String str, String str2, iu30 iu30Var, kt91 kt91Var) {
        this.a = pd71Var;
        this.b = jjzVar;
        this.c = bfdVar;
        this.d = r35Var;
        this.e = context;
        this.f = str;
        this.g = str2;
        this.h = iu30Var;
        this.i = kt91Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:104:0x01b7 A[Catch: Exception -> 0x0344, CancellationException -> 0x034c, TRY_ENTER, TryCatch #29 {CancellationException -> 0x034c, Exception -> 0x0344, blocks: (B:108:0x01d3, B:95:0x019d, B:104:0x01b7), top: B:251:0x019d }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:121:0x021b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0237  */
    /* JADX WARN: Code duplicated, block: B:139:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:186:0x0371  */
    /* JADX WARN: Code duplicated, block: B:189:0x0394  */
    /* JADX WARN: Code duplicated, block: B:192:0x0398  */
    /* JADX WARN: Code duplicated, block: B:197:0x03d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:200:0x03df  */
    /* JADX WARN: Code duplicated, block: B:202:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:204:0x0400 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:233:0x01a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0128 A[Catch: CancellationException -> 0x00d5, Exception -> 0x00e4, TryCatch #10 {CancellationException -> 0x00d5, blocks: (B:41:0x00ce, B:46:0x00df, B:88:0x0187, B:50:0x00f0, B:64:0x0122, B:66:0x0128, B:84:0x016b, B:67:0x0132, B:69:0x013a, B:71:0x013f, B:73:0x0147, B:74:0x014d, B:75:0x0152), top: B:216:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0132 A[Catch: CancellationException -> 0x00d5, Exception -> 0x00e4, TryCatch #10 {CancellationException -> 0x00d5, blocks: (B:41:0x00ce, B:46:0x00df, B:88:0x0187, B:50:0x00f0, B:64:0x0122, B:66:0x0128, B:84:0x016b, B:67:0x0132, B:69:0x013a, B:71:0x013f, B:73:0x0147, B:74:0x014d, B:75:0x0152), top: B:216:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x013a A[Catch: CancellationException -> 0x00d5, Exception -> 0x00e4, TryCatch #10 {CancellationException -> 0x00d5, blocks: (B:41:0x00ce, B:46:0x00df, B:88:0x0187, B:50:0x00f0, B:64:0x0122, B:66:0x0128, B:84:0x016b, B:67:0x0132, B:69:0x013a, B:71:0x013f, B:73:0x0147, B:74:0x014d, B:75:0x0152), top: B:216:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x013f A[Catch: CancellationException -> 0x00d5, Exception -> 0x00e4, TryCatch #10 {CancellationException -> 0x00d5, blocks: (B:41:0x00ce, B:46:0x00df, B:88:0x0187, B:50:0x00f0, B:64:0x0122, B:66:0x0128, B:84:0x016b, B:67:0x0132, B:69:0x013a, B:71:0x013f, B:73:0x0147, B:74:0x014d, B:75:0x0152), top: B:216:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0147 A[Catch: CancellationException -> 0x00d5, Exception -> 0x00e4, TryCatch #10 {CancellationException -> 0x00d5, blocks: (B:41:0x00ce, B:46:0x00df, B:88:0x0187, B:50:0x00f0, B:64:0x0122, B:66:0x0128, B:84:0x016b, B:67:0x0132, B:69:0x013a, B:71:0x013f, B:73:0x0147, B:74:0x014d, B:75:0x0152), top: B:216:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x014d A[Catch: CancellationException -> 0x00d5, Exception -> 0x00e4, TryCatch #10 {CancellationException -> 0x00d5, blocks: (B:41:0x00ce, B:46:0x00df, B:88:0x0187, B:50:0x00f0, B:64:0x0122, B:66:0x0128, B:84:0x016b, B:67:0x0132, B:69:0x013a, B:71:0x013f, B:73:0x0147, B:74:0x014d, B:75:0x0152), top: B:216:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x016b A[Catch: CancellationException -> 0x00d5, Exception -> 0x00e4, TRY_ENTER, TryCatch #10 {CancellationException -> 0x00d5, blocks: (B:41:0x00ce, B:46:0x00df, B:88:0x0187, B:50:0x00f0, B:64:0x0122, B:66:0x0128, B:84:0x016b, B:67:0x0132, B:69:0x013a, B:71:0x013f, B:73:0x0147, B:74:0x014d, B:75:0x0152), top: B:216:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0180  */
    /* JADX WARN: Code duplicated, block: B:87:0x0182  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0395, code lost:
    
        if (r1 == r14) goto L204;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r38, p.r261 r39, p.onm r40) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 1050
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.tl50.a(java.lang.Object, p.r261, p.onm):java.lang.Object");
    }
}
