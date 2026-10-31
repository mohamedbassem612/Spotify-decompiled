package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.internal.util.OpenHashSet;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {
    public OpenHashSet a;
    public volatile boolean b;

    public CompositeDisposable(Disposable... disposableArr) {
        this.a = new OpenHashSet(disposableArr.length + 1, 0);
        for (Disposable disposable : disposableArr) {
            Objects.requireNonNull(disposable, "A Disposable in the disposables array is null");
            this.a.a(disposable);
        }
    }

    public static void h(OpenHashSet openHashSet) {
        if (openHashSet == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : openHashSet.e) {
            if (obj instanceof Disposable) {
                try {
                    ((Disposable) obj).dispose();
                } catch (Throwable th) {
                    Exceptions.a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.f((Throwable) arrayList.get(0));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public final boolean a(Disposable disposable) {
        if (!c(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public final boolean b(Disposable disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        OpenHashSet openHashSet = this.a;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet();
                            this.a = openHashSet;
                        }
                        openHashSet.a(disposable);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.rxjava3.disposables.DisposableContainer
    public final boolean c(Disposable disposable) {
        Object obj;
        Objects.requireNonNull(disposable, "disposable is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return false;
                }
                OpenHashSet openHashSet = this.a;
                if (openHashSet != null) {
                    Object[] objArr = openHashSet.e;
                    int i = openHashSet.b;
                    int iHashCode = disposable.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(disposable)) {
                            openHashSet.b(i2, i, objArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj = objArr[i2];
                                if (obj == null) {
                                }
                            } while (!obj.equals(disposable));
                            openHashSet.b(i2, i, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                OpenHashSet openHashSet = this.a;
                this.a = null;
                h(openHashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Disposable... disposableArr) {
        int i = 0;
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        OpenHashSet openHashSet = this.a;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet(disposableArr.length + 1, 0);
                            this.a = openHashSet;
                        }
                        int length = disposableArr.length;
                        while (i < length) {
                            Disposable disposable = disposableArr[i];
                            Objects.requireNonNull(disposable, "A Disposable in the disposables array is null");
                            openHashSet.a(disposable);
                            i++;
                        }
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int length2 = disposableArr.length;
        while (i < length2) {
            disposableArr[i].dispose();
            i++;
        }
    }

    public final void g() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return;
                }
                OpenHashSet openHashSet = this.a;
                this.a = null;
                h(openHashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int i() {
        if (this.b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.b) {
                    return 0;
                }
                OpenHashSet openHashSet = this.a;
                return openHashSet != null ? openHashSet.c : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.b;
    }

    public CompositeDisposable() {
    }
}
