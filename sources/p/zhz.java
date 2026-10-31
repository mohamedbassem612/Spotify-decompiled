package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zhz extends hab0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aiz b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zhz(int i, aiz aizVar, long j) {
        super(0);
        this.a = i;
        this.b = aizVar;
        this.c = j;
    }

    public final Object invoke() {
        int iC = l1d.C(this.a);
        if (iC != 0 && iC != 1) {
            long j = this.c;
            aiz aizVar = this.b;
            if (iC == 2) {
                aizVar.Y(Long.valueOf(j), "player_fatal_error");
            } else if (iC == 3 || iC == 4) {
                aizVar.Y(Long.valueOf(j), "player_recoverable_error");
            } else {
                if (iC != 5) {
                    eg.o();
                    return null;
                }
                if (!aizVar.q1) {
                    aizVar.Y(Long.valueOf(j), "player_released");
                }
            }
        }
        return rih1.a;
    }
}
