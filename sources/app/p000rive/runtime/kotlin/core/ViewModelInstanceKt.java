package app.p000rive.runtime.kotlin.core;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p.iu30;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aT\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0082\b¢\u0006\u0004\b\t\u0010\n\u001a.\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0082\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a4\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"T", "Lkotlin/Function0;", "Ljava/util/concurrent/locks/ReentrantLock;", "currentFileLock", "newFileLock", "Lkotlin/Function1;", "Lp/rih1;", "setFileLock", "snapshotOfDependents", "updateFileLockWithRetry", "(Lkotlin/jvm/functions/Function0;Ljava/util/concurrent/locks/ReentrantLock;Lp/iu30;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "firstLock", "secondLock", "block", "withFileLocksInOrder", "(Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/locks/ReentrantLock;Lkotlin/jvm/functions/Function0;)V", "R", "withCurrentFileLock", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "", "fileLockUpdateTieLock", "Ljava/lang/Object;", "kotlin_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewModelInstanceKt {
    private static final Object fileLockUpdateTieLock = new Object();

    private static final <T> T updateFileLockWithRetry(Function0 function0, ReentrantLock reentrantLock, iu30 iu30Var, Function0 function1) {
        T t;
        boolean z;
        do {
            ReentrantLock reentrantLock2 = (ReentrantLock) function0.invoke();
            t = null;
            if (reentrantLock2 == reentrantLock) {
                return null;
            }
            z = true;
            if (reentrantLock2 == reentrantLock) {
                synchronized (reentrantLock2) {
                    if (function0.invoke() == reentrantLock2) {
                        iu30Var.invoke(reentrantLock);
                        t = (T) function1.invoke();
                    } else {
                        z = false;
                    }
                }
            } else {
                int iIdentityHashCode = System.identityHashCode(reentrantLock2);
                int iIdentityHashCode2 = System.identityHashCode(reentrantLock);
                if (iIdentityHashCode < iIdentityHashCode2) {
                    synchronized (reentrantLock2) {
                        synchronized (reentrantLock) {
                            if (function0.invoke() == reentrantLock2) {
                                iu30Var.invoke(reentrantLock);
                                t = (T) function1.invoke();
                            } else {
                                z = false;
                            }
                        }
                    }
                } else if (iIdentityHashCode > iIdentityHashCode2) {
                    synchronized (reentrantLock) {
                        synchronized (reentrantLock2) {
                            if (function0.invoke() == reentrantLock2) {
                                iu30Var.invoke(reentrantLock);
                                t = (T) function1.invoke();
                            } else {
                                z = false;
                            }
                        }
                    }
                } else {
                    synchronized (fileLockUpdateTieLock) {
                        synchronized (reentrantLock2) {
                            synchronized (reentrantLock) {
                                if (function0.invoke() == reentrantLock2) {
                                    iu30Var.invoke(reentrantLock);
                                    t = (T) function1.invoke();
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                }
            }
        } while (!z);
        return t;
    }

    private static final <R> R withCurrentFileLock(Function0 function0, Function0 function1) {
        while (true) {
            ReentrantLock reentrantLock = (ReentrantLock) function0.invoke();
            synchronized (reentrantLock) {
                if (function0.invoke() == reentrantLock) {
                    return (R) function1.invoke();
                }
            }
        }
    }

    private static final void withFileLocksInOrder(ReentrantLock reentrantLock, ReentrantLock reentrantLock2, Function0 function0) {
        if (reentrantLock == reentrantLock2) {
            synchronized (reentrantLock) {
                function0.invoke();
            }
            return;
        }
        int iIdentityHashCode = System.identityHashCode(reentrantLock);
        int iIdentityHashCode2 = System.identityHashCode(reentrantLock2);
        if (iIdentityHashCode < iIdentityHashCode2) {
            synchronized (reentrantLock) {
                synchronized (reentrantLock2) {
                    function0.invoke();
                }
            }
        } else if (iIdentityHashCode > iIdentityHashCode2) {
            synchronized (reentrantLock2) {
                synchronized (reentrantLock) {
                    function0.invoke();
                }
            }
        } else {
            synchronized (fileLockUpdateTieLock) {
                synchronized (reentrantLock) {
                    synchronized (reentrantLock2) {
                        function0.invoke();
                    }
                }
            }
        }
    }
}
