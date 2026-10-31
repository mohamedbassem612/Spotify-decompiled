package p;

import app.p000rive.semantics.SemanticState;
import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class yfi implements fv30 {
    public final Object K(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        int i;
        qim0 qim0Var = (qim0) obj;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        mdm mdmVar = (mdm) obj4;
        xu30 xu30Var = (xu30) obj5;
        Function0 function0 = (Function0) obj6;
        x340 x340Var = (b0k) obj7;
        int iIntValue = ((Integer) obj8).intValue();
        if ((iIntValue & 6) == 0) {
            i = (x340Var.g(qim0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= x340Var.g(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.h(zBooleanValue) ? SemanticState.Hidden : SemanticState.Focused;
        }
        if ((iIntValue & 3072) == 0) {
            i |= x340Var.g(mdmVar) ? SemanticState.Modal : SemanticState.ReadOnly;
        }
        if ((iIntValue & 24576) == 0) {
            i |= x340Var.i(xu30Var) ? TlsSocketProvider.READ_BUFFER_SIZE : SemanticState.Multiline;
        }
        if ((iIntValue & 196608) == 0) {
            i |= x340Var.i(function0) ? 131072 : 65536;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (599187 & i) != 599186)) {
            ijm.c(str, zBooleanValue, mdmVar, qim0Var, xu30Var, function0, x340Var2, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
