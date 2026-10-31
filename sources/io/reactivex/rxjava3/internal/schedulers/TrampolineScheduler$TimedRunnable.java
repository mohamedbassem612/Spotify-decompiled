package io.reactivex.rxjava3.internal.schedulers;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class TrampolineScheduler$TimedRunnable implements Comparable<TrampolineScheduler$TimedRunnable> {
    public final Runnable a;
    public final long b;
    public final int c;
    public volatile boolean d;

    public TrampolineScheduler$TimedRunnable(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(TrampolineScheduler$TimedRunnable trampolineScheduler$TimedRunnable) {
        TrampolineScheduler$TimedRunnable trampolineScheduler$TimedRunnable2 = trampolineScheduler$TimedRunnable;
        int iCompare = Long.compare(this.b, trampolineScheduler$TimedRunnable2.b);
        return iCompare == 0 ? Integer.compare(this.c, trampolineScheduler$TimedRunnable2.c) : iCompare;
    }
}
