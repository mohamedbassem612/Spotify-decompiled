package app.p000rive.core;

import java.util.Map;
import kotlin.Metadata;
import p.b0k;
import p.czo1;
import p.h311;
import p.hab0;
import p.rih1;
import p.vu30;
import p.x340;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "", "", "trackMap", "Lp/rih1;", "RebuggerWrapper", "(Ljava/util/Map;Lp/b0k;I)V", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class RebuggerWrapperKt {

    /* JADX INFO: renamed from: app.rive.core.RebuggerWrapperKt$RebuggerWrapper$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends hab0 implements vu30 {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Map<String, Object> $trackMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Map<String, ? extends Object> map, int i) {
            super(2);
            this.$trackMap = map;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0k) obj, ((Number) obj2).intValue());
            return rih1.a;
        }

        public final void invoke(b0k b0kVar, int i) {
            RebuggerWrapperKt.RebuggerWrapper(this.$trackMap, b0kVar, czo1.p(this.$$changed | 1));
        }
    }

    public static final void RebuggerWrapper(Map<String, ? extends Object> map, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1289810294);
        if ((i & 1) == 0 && x340Var.H()) {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new AnonymousClass1(map, i);
        }
    }
}
