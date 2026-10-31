package p;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ek5 {
    public final EditText a;
    private final f4x b;

    public ek5(EditText editText) {
        this.a = editText;
        this.b = new f4x(editText);
    }

    public static boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public final KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        gmt gmtVar = this.b.a;
        if (keyListener instanceof j4x) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new j4x(keyListener);
    }

    public final void c(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, moz0.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final h4x d(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        f4x f4xVar = this.b;
        if (inputConnection == null) {
            f4xVar.getClass();
            inputConnection2 = null;
        } else {
            gmt gmtVar = f4xVar.a;
            if (!(inputConnection instanceof h4x)) {
                inputConnection = new h4x(editorInfo, inputConnection, (EditText) gmtVar.b);
            }
            inputConnection2 = inputConnection;
        }
        return (h4x) inputConnection2;
    }

    public final void e(boolean z) {
        k5x k5xVar = (k5x) this.b.a.c;
        if (k5xVar.c != z) {
            if (k5xVar.b != null) {
                a4x a4xVarA = a4x.a();
                j5x j5xVar = k5xVar.b;
                d46 d46Var = a4xVarA.b;
                o0c.p(j5xVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a4xVarA.a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    ArrayList arrayList = new ArrayList();
                    d46Var.getClass();
                    w36 w36Var = new w36(d46Var);
                    while (w36Var.hasNext()) {
                        y3x y3xVar = (y3x) w36Var.next();
                        if (y3xVar.a == j5xVar) {
                            arrayList.add(y3xVar);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        d46Var.remove((y3x) it.next());
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th;
                }
            }
            k5xVar.c = z;
            if (z) {
                k5x.a(k5xVar.a, a4x.a().c());
            }
        }
    }
}
