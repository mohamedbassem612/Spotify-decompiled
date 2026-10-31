package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h3n extends ViewGroup.MarginLayoutParams {
    public e3n a;
    public boolean b;
    public int c;
    public int d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f45p;

    public h3n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.f45p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tnz0.b);
        this.c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.W0;
            e3n e3nVar = null;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.W0;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.Y0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.X0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    e3nVar = (e3n) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    bhn0.o("Could not inflate Behavior subclass ".concat(string), e);
                    throw null;
                }
            }
            this.a = e3nVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        e3n e3nVar2 = this.a;
        if (e3nVar2 != null) {
            e3nVar2.c(this);
        }
    }

    public final boolean a(int i) {
        if (i == 0) {
            return this.m;
        }
        if (i != 1) {
            return false;
        }
        return this.n;
    }

    public final void b(e3n e3nVar) {
        e3n e3nVar2 = this.a;
        if (e3nVar2 != e3nVar) {
            if (e3nVar2 != null) {
                e3nVar2.f();
            }
            this.a = e3nVar;
            this.b = true;
            if (e3nVar != null) {
                e3nVar.c(this);
            }
        }
    }

    public h3n(int i, int i2) {
        super(i, i2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.f45p = new Rect();
    }

    public h3n(h3n h3nVar) {
        super((ViewGroup.MarginLayoutParams) h3nVar);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.f45p = new Rect();
    }

    public h3n(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.f45p = new Rect();
    }

    public h3n(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.f45p = new Rect();
    }
}
