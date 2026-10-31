package androidx.xr.runtime;

import java.util.List;
import kotlin.Metadata;
import p.i7n;
import p.lnm;
import p.nka0;
import p.rih1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/xr/runtime/StateExtender;", "", "", "Lp/nka0;", "runtimes", "Lp/rih1;", "initialize", "(Ljava/util/List;)V", "Lp/i7n;", "coreState", "extend", "(Lp/i7n;Lp/lnm;)Ljava/lang/Object;", "close", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface StateExtender {
    void close();

    Object extend(i7n i7nVar, lnm<? super rih1> lnmVar);

    void initialize(List<? extends nka0> runtimes);
}
