package p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t01 implements Function, za21, o4e1 {
    public int a;
    public final Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public t01(n0v0 n0v0Var) {
        this.b = new up20(30, (byte) 3);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.a = 0;
        this.e = n0v0Var;
        this.f = new mre0((Object) this, (byte) 24);
    }

    public static t01 i(Context context, int i) {
        o0c.k("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, omz0.x);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListI = dgo1.i(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListI2 = dgo1.i(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListI3 = dgo1.i(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        iw61 iw61VarD = iw61.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new k5(0.0f)).d();
        typedArrayObtainStyledAttributes.recycle();
        return new t01(colorStateListI, colorStateListI2, colorStateListI3, dimensionPixelSize, iw61VarD, rect);
    }

    public void A(s01 s01Var) {
        n0v0 n0v0Var = (n0v0) this.e;
        ((ArrayList) this.d).add(s01Var);
        byte b = s01Var.a;
        if (b == 1) {
            n0v0Var.s(s01Var.b, s01Var.d);
            return;
        }
        if (b == 2) {
            int i = s01Var.b;
            int i2 = s01Var.d;
            RecyclerView recyclerView = (RecyclerView) n0v0Var.b;
            recyclerView.b0(i, i2, false);
            recyclerView.K1 = true;
            return;
        }
        if (b == 4) {
            n0v0Var.r(s01Var.b, s01Var.d, s01Var.c);
        } else if (b == 8) {
            n0v0Var.t(s01Var.b, s01Var.d);
        } else {
            hhg1.g(s01Var, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0198  */
    /* JADX WARN: Code duplicated, block: B:104:0x019c  */
    /* JADX WARN: Code duplicated, block: B:188:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0150  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:89:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x0169  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x017f  */
    public void B() {
        boolean z;
        byte b;
        s01 s01VarY;
        int i;
        int i2;
        int i3;
        s01 s01VarY2;
        boolean z2;
        boolean z3;
        Object obj;
        s01 s01Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        up20 up20Var = (up20) this.b;
        n0v0 n0v0Var = (n0v0) this.e;
        mre0 mre0Var = (mre0) this.f;
        ArrayList arrayList = (ArrayList) this.c;
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((s01) arrayList.get(size)).a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            t01 t01Var = (t01) mre0Var.b;
            up20 up20Var2 = (up20) t01Var.b;
            s01 s01Var2 = (s01) arrayList.get(size);
            s01 s01Var3 = (s01) arrayList.get(i12);
            byte b2 = s01Var3.a;
            if (b2 == 1) {
                int i13 = s01Var2.d;
                int i14 = s01Var3.b;
                int i15 = i13 < i14 ? -1 : 0;
                int i16 = s01Var2.b;
                if (i16 < i14) {
                    i15++;
                }
                if (i14 <= i16) {
                    s01Var2.b = i16 + s01Var3.d;
                }
                int i17 = s01Var3.b;
                if (i17 <= i13) {
                    s01Var2.d = i13 + s01Var3.d;
                }
                s01Var3.b = i17 + i15;
                arrayList.set(size, s01Var3);
                arrayList.set(i12, s01Var2);
            } else if (b2 == 2) {
                int i18 = s01Var2.b;
                int i19 = s01Var2.d;
                int i20 = s01Var3.b;
                if (i18 < i19) {
                    if (i20 == i18 && s01Var3.d == i19 - i18) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i20 == i19 + 1 && s01Var3.d == i18 - i19) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i19 < i20) {
                    i20--;
                    s01Var3.b = i20;
                } else {
                    int i21 = s01Var3.d;
                    if (i19 < i20 + i21) {
                        s01Var3.d = i21 - 1;
                        s01Var2.a = (byte) 2;
                        s01Var2.d = 1;
                        if (s01Var3.d == 0) {
                            arrayList.remove(i12);
                            s01Var3.c = null;
                            up20Var2.i(s01Var3);
                        }
                    }
                }
                int i22 = s01Var2.b;
                if (i22 <= i20) {
                    s01Var3.b = i20 + 1;
                } else {
                    int i23 = i20 + s01Var3.d;
                    if (i22 < i23) {
                        obj = null;
                        s01 s01VarY3 = t01Var.y(null, 2, i22 + 1, i23 - i22);
                        s01Var3.d = s01Var2.b - s01Var3.b;
                        s01Var = s01VarY3;
                    }
                    if (z3) {
                        arrayList.set(size, s01Var3);
                        arrayList.remove(i12);
                        s01Var2.c = obj;
                        up20Var2.i(s01Var2);
                    } else {
                        if (z2) {
                            if (s01Var != null) {
                                i10 = s01Var2.b;
                                if (i10 > s01Var.b) {
                                    s01Var2.b = i10 - s01Var.d;
                                }
                                i11 = s01Var2.d;
                                if (i11 > s01Var.b) {
                                    s01Var2.d = i11 - s01Var.d;
                                }
                            }
                            i8 = s01Var2.b;
                            if (i8 > s01Var3.b) {
                                s01Var2.b = i8 - s01Var3.d;
                            }
                            i9 = s01Var2.d;
                            if (i9 > s01Var3.b) {
                                s01Var2.d = i9 - s01Var3.d;
                            }
                        } else {
                            if (s01Var != null) {
                                i6 = s01Var2.b;
                                if (i6 >= s01Var.b) {
                                    s01Var2.b = i6 - s01Var.d;
                                }
                                i7 = s01Var2.d;
                                if (i7 >= s01Var.b) {
                                    s01Var2.d = i7 - s01Var.d;
                                }
                            }
                            i4 = s01Var2.b;
                            if (i4 >= s01Var3.b) {
                                s01Var2.b = i4 - s01Var3.d;
                            }
                            i5 = s01Var2.d;
                            if (i5 >= s01Var3.b) {
                                s01Var2.d = i5 - s01Var3.d;
                            }
                        }
                        arrayList.set(size, s01Var3);
                        if (s01Var2.b != s01Var2.d) {
                            arrayList.set(i12, s01Var2);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (s01Var != null) {
                            arrayList.add(size, s01Var);
                        }
                    }
                }
                obj = null;
                s01Var = null;
                if (z3) {
                    arrayList.set(size, s01Var3);
                    arrayList.remove(i12);
                    s01Var2.c = obj;
                    up20Var2.i(s01Var2);
                } else {
                    if (z2) {
                        if (s01Var != null) {
                            i10 = s01Var2.b;
                            if (i10 > s01Var.b) {
                                s01Var2.b = i10 - s01Var.d;
                            }
                            i11 = s01Var2.d;
                            if (i11 > s01Var.b) {
                                s01Var2.d = i11 - s01Var.d;
                            }
                        }
                        i8 = s01Var2.b;
                        if (i8 > s01Var3.b) {
                            s01Var2.b = i8 - s01Var3.d;
                        }
                        i9 = s01Var2.d;
                        if (i9 > s01Var3.b) {
                            s01Var2.d = i9 - s01Var3.d;
                        }
                    } else {
                        if (s01Var != null) {
                            i6 = s01Var2.b;
                            if (i6 >= s01Var.b) {
                                s01Var2.b = i6 - s01Var.d;
                            }
                            i7 = s01Var2.d;
                            if (i7 >= s01Var.b) {
                                s01Var2.d = i7 - s01Var.d;
                            }
                        }
                        i4 = s01Var2.b;
                        if (i4 >= s01Var3.b) {
                            s01Var2.b = i4 - s01Var3.d;
                        }
                        i5 = s01Var2.d;
                        if (i5 >= s01Var3.b) {
                            s01Var2.d = i5 - s01Var3.d;
                        }
                    }
                    arrayList.set(size, s01Var3);
                    if (s01Var2.b != s01Var2.d) {
                        arrayList.set(i12, s01Var2);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (s01Var != null) {
                        arrayList.add(size, s01Var);
                    }
                }
            } else if (b2 == 4) {
                int i24 = s01Var2.d;
                int i25 = s01Var3.b;
                if (i24 < i25) {
                    s01Var3.b = i25 - 1;
                } else {
                    int i26 = s01Var3.d;
                    if (i24 < i25 + i26) {
                        s01Var3.d = i26 - 1;
                        s01VarY = t01Var.y(s01Var3.c, 4, s01Var2.b, 1);
                    }
                    i = s01Var2.b;
                    i2 = s01Var3.b;
                    if (i <= i2) {
                        s01Var3.b = i2 + 1;
                    } else {
                        i3 = i2 + s01Var3.d;
                        if (i < i3) {
                            int i27 = i3 - i;
                            s01VarY2 = t01Var.y(s01Var3.c, 4, i + 1, i27);
                            s01Var3.d -= i27;
                        }
                        arrayList.set(i12, s01Var2);
                        if (s01Var3.d > 0) {
                            arrayList.set(size, s01Var3);
                        } else {
                            arrayList.remove(size);
                            s01Var3.c = null;
                            up20Var2.i(s01Var3);
                        }
                        if (s01VarY != null) {
                            arrayList.add(size, s01VarY);
                        }
                        if (s01VarY2 != null) {
                            arrayList.add(size, s01VarY2);
                        }
                    }
                    s01VarY2 = null;
                    arrayList.set(i12, s01Var2);
                    if (s01Var3.d > 0) {
                        arrayList.set(size, s01Var3);
                    } else {
                        arrayList.remove(size);
                        s01Var3.c = null;
                        up20Var2.i(s01Var3);
                    }
                    if (s01VarY != null) {
                        arrayList.add(size, s01VarY);
                    }
                    if (s01VarY2 != null) {
                        arrayList.add(size, s01VarY2);
                    }
                }
                s01VarY = null;
                i = s01Var2.b;
                i2 = s01Var3.b;
                if (i <= i2) {
                    s01Var3.b = i2 + 1;
                } else {
                    i3 = i2 + s01Var3.d;
                    if (i < i3) {
                        int i28 = i3 - i;
                        s01VarY2 = t01Var.y(s01Var3.c, 4, i + 1, i28);
                        s01Var3.d -= i28;
                    }
                    arrayList.set(i12, s01Var2);
                    if (s01Var3.d > 0) {
                        arrayList.set(size, s01Var3);
                    } else {
                        arrayList.remove(size);
                        s01Var3.c = null;
                        up20Var2.i(s01Var3);
                    }
                    if (s01VarY != null) {
                        arrayList.add(size, s01VarY);
                    }
                    if (s01VarY2 != null) {
                        arrayList.add(size, s01VarY2);
                    }
                }
                s01VarY2 = null;
                arrayList.set(i12, s01Var2);
                if (s01Var3.d > 0) {
                    arrayList.set(size, s01Var3);
                } else {
                    arrayList.remove(size);
                    s01Var3.c = null;
                    up20Var2.i(s01Var3);
                }
                if (s01VarY != null) {
                    arrayList.add(size, s01VarY);
                }
                if (s01VarY2 != null) {
                    arrayList.add(size, s01VarY2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i29 = 0; i29 < size2; i29++) {
            s01 s01VarY4 = (s01) arrayList.get(i29);
            byte b3 = s01VarY4.a;
            if (b3 == 1) {
                A(s01VarY4);
            } else if (b3 == 2) {
                int i30 = s01VarY4.b;
                int i31 = s01VarY4.d + i30;
                int i32 = i30;
                int i33 = 0;
                byte b4 = -1;
                while (i32 < i31) {
                    if (n0v0Var.q(i32) != null || c(i32)) {
                        if (b4 == 0) {
                            j(y(null, 2, i30, i33));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b4 == 1) {
                            A(y(null, 2, i30, i33));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i32 -= i33;
                        i31 -= i33;
                        i33 = 1;
                    } else {
                        i33++;
                    }
                    i32++;
                    b4 = b;
                }
                if (i33 != s01VarY4.d) {
                    s01VarY4.c = null;
                    up20Var.i(s01VarY4);
                    s01VarY4 = y(null, 2, i30, i33);
                }
                if (b4 == 0) {
                    j(s01VarY4);
                } else {
                    A(s01VarY4);
                }
            } else if (b3 == 4) {
                int i34 = s01VarY4.b;
                int i35 = s01VarY4.d + i34;
                int i36 = i34;
                int i37 = 0;
                byte b5 = -1;
                while (i34 < i35) {
                    if (n0v0Var.q(i34) != null || c(i34)) {
                        if (b5 == 0) {
                            j(y(s01VarY4.c, 4, i36, i37));
                            i36 = i34;
                            i37 = 0;
                        }
                        b5 = 1;
                    } else {
                        if (b5 == 1) {
                            A(y(s01VarY4.c, 4, i36, i37));
                            i36 = i34;
                            i37 = 0;
                        }
                        b5 = 0;
                    }
                    i37++;
                    i34++;
                }
                if (i37 != s01VarY4.d) {
                    Object obj2 = s01VarY4.c;
                    s01VarY4.c = null;
                    up20Var.i(s01VarY4);
                    s01VarY4 = y(obj2, 4, i36, i37);
                }
                if (b5 == 0) {
                    j(s01VarY4);
                } else {
                    A(s01VarY4);
                }
            } else if (b3 == 8) {
                A(s01VarY4);
            }
        }
        arrayList.clear();
    }

    public void C(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s01 s01Var = (s01) arrayList.get(i);
            s01Var.c = null;
            ((up20) this.b).i(s01Var);
        }
        arrayList.clear();
    }

    public void D() {
        C((ArrayList) this.c);
        C((ArrayList) this.d);
        this.a = 0;
    }

    public void E(Runnable runnable) {
        wdd1 wdd1Var = (wdd1) this.b;
        if (wdd1Var.a.getLooper().getThread().isAlive()) {
            wdd1Var.f(runnable);
        }
    }

    public void F(int i) {
        dm5.y(i >= 0);
        this.a = i;
        o(i);
    }

    public int G(int i, int i2) {
        int i3;
        int i4;
        up20 up20Var = (up20) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s01 s01Var = (s01) arrayList.get(size);
            byte b = s01Var.a;
            int i5 = s01Var.b;
            if (b == 8) {
                int i6 = s01Var.d;
                if (i5 < i6) {
                    i4 = i6;
                    i3 = i5;
                } else {
                    i3 = i6;
                    i4 = i5;
                }
                if (i < i3 || i > i4) {
                    if (i < i5) {
                        if (i2 == 1) {
                            s01Var.b = i5 + 1;
                            s01Var.d = i6 + 1;
                        } else if (i2 == 2) {
                            s01Var.b = i5 - 1;
                            s01Var.d = i6 - 1;
                        }
                    }
                } else if (i3 == i5) {
                    if (i2 == 1) {
                        s01Var.d = i6 + 1;
                    } else if (i2 == 2) {
                        s01Var.d = i6 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        s01Var.b = i5 + 1;
                    } else if (i2 == 2) {
                        s01Var.b = i5 - 1;
                    }
                    i--;
                }
            } else if (i5 <= i) {
                if (b == 1) {
                    i -= s01Var.d;
                } else if (b == 2) {
                    i += s01Var.d;
                }
            } else if (i2 == 1) {
                s01Var.b = i5 + 1;
            } else if (i2 == 2) {
                s01Var.b = i5 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            s01 s01Var2 = (s01) arrayList.get(size2);
            byte b2 = s01Var2.a;
            int i7 = s01Var2.d;
            if (b2 == 8) {
                if (i7 == s01Var2.b || i7 < 0) {
                    arrayList.remove(size2);
                    s01Var2.c = null;
                    up20Var.i(s01Var2);
                }
            } else if (i7 <= 0) {
                arrayList.remove(size2);
                s01Var2.c = null;
                up20Var.i(s01Var2);
            }
        }
        return i;
    }

    public void H(Object obj) {
        Object obj2 = this.e;
        this.e = obj;
        if (obj2.equals(obj)) {
            return;
        }
        yo00 yo00Var = ((io00) this.d).b;
        ((Integer) obj2).getClass();
        int iIntValue = ((Integer) obj).intValue();
        yo00Var.J1();
        yo00Var.l.g.b(40, iIntValue, 0).b();
        yo00Var.m.h(21, new nfr(iIntValue, (byte) 2));
    }

    public void I() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(wf10.a()).edit();
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", ((Long) this.b).longValue());
        Long l = (Long) this.c;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l != null ? l.longValue() : 0L);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.a);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", ((UUID) this.d).toString());
        editorEdit.apply();
        nql nqlVar = (nql) this.f;
        if (nqlVar != null) {
            SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(wf10.a()).edit();
            editorEdit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", nqlVar.b);
            editorEdit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", nqlVar.c);
            editorEdit2.apply();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r10, p.izr0 r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.d
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.a
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.a
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            p.re21 r3 = (p.re21) r3
            java.lang.String r5 = p.zoi1.a
            long r5 = r3.b
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.c
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            p.izr0 r3 = new p.izr0
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            p.izr0 r3 = (p.izr0) r3
        L45:
            int r5 = r12.a()
            r3.O(r5)
            byte[] r5 = r12.a
            int r12 = r12.b
            byte[] r6 = r3.a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.f
            p.re21 r12 = (p.re21) r12
            if (r12 == 0) goto L6c
            long r5 = r12.b
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r9 = r12.a
            r9.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            p.re21 r12 = new p.re21
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            p.re21 r12 = (p.re21) r12
        L7e:
            java.util.ArrayList r0 = r12.a
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            p.dm5.m(r8)
            boolean r2 = r0.isEmpty()
            p.dm5.y(r2)
            r12.b = r10
            r0.add(r3)
            r1.add(r12)
            r9.f = r12
            int r10 = r9.a
            if (r10 == r4) goto L9e
            r9.o(r10)
        L9e:
            return
        L9f:
            java.lang.Object r9 = r9.b
            p.se21 r9 = (p.se21) r9
            r9.e(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.t01.a(long, p.izr0):void");
    }

    public Object apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        return (playerState.isPlaying() && !playerState.isPaused() && u890.j((String) this.b, playerState.contextUri())) ? CompletableEmpty.a : ((lrd) this.c).s((String) this.d, (String) this.e, (Bundle) this.f, this.a, true);
    }

    public int b(int i) {
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s01 s01Var = (s01) arrayList.get(i2);
            byte b = s01Var.a;
            if (b != 1) {
                if (b == 2) {
                    int i3 = s01Var.b;
                    if (i3 <= i) {
                        int i4 = s01Var.d;
                        if (i3 + i4 > i) {
                            return -1;
                        }
                        i -= i4;
                    } else {
                        continue;
                    }
                } else if (b == 8) {
                    int i5 = s01Var.b;
                    if (i5 == i) {
                        i = s01Var.d;
                    } else {
                        if (i5 < i) {
                            i--;
                        }
                        if (s01Var.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (s01Var.b <= i) {
                i += s01Var.d;
            }
        }
        return i;
    }

    public boolean c(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s01 s01Var = (s01) arrayList.get(i2);
            byte b = s01Var.a;
            if (b != 8) {
                if (b == 1) {
                    int i3 = s01Var.b;
                    int i4 = s01Var.d + i3;
                    while (i3 < i4) {
                        if (n(i3, i2 + 1) == i) {
                            return true;
                        }
                        i3++;
                    }
                } else {
                    continue;
                }
            } else {
                if (n(s01Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void d() {
        ((ven0) this.b).setValue(Boolean.TRUE);
    }

    public void e() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((n0v0) this.e).p((s01) arrayList.get(i));
        }
        C(arrayList);
        this.a = 0;
    }

    public void f(int i, j2i j2iVar, b0k b0kVar) {
        b0k b0kVar2;
        lee1 lee1Var = (lee1) this.f;
        tvh1 tvh1Var = (tvh1) this.c;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-163292036);
        int i2 = (b0kVar3.g(this) ? 32 : 16) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            String string = ((y7e1) this.b).d().d.toString();
            b0kVar2 = b0kVar3;
            i5x0.Q0.g(string, apo.r(1211828587, new tte1(string, j2iVar, (u251) this.e, lee1Var, (tvh1) this.c, (byte) 7), b0kVar3), true, false, m9x0.X0, (idn0) this.d, apo.r(993698372, new heb1(this.a, tvh1Var, lee1Var), b0kVar3), (vu30) null, (vu30) null, (hw61) null, y251.h(b0kVar3), tvh1Var.d, (vu30) null, b0kVar2, 100666800, 0, 163520);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(this, j2iVar, i, (byte) 24);
        }
    }

    public void g() {
        n0v0 n0v0Var = (n0v0) this.e;
        e();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            s01 s01Var = (s01) arrayList.get(i);
            byte b = s01Var.a;
            if (b == 1) {
                n0v0Var.p(s01Var);
                n0v0Var.s(s01Var.b, s01Var.d);
            } else if (b == 2) {
                n0v0Var.p(s01Var);
                int i2 = s01Var.b;
                int i3 = s01Var.d;
                RecyclerView recyclerView = (RecyclerView) n0v0Var.b;
                recyclerView.b0(i2, i3, true);
                recyclerView.K1 = true;
                recyclerView.H1.c += i3;
            } else if (b == 4) {
                n0v0Var.p(s01Var);
                n0v0Var.r(s01Var.b, s01Var.d, s01Var.c);
            } else if (b == 8) {
                n0v0Var.p(s01Var);
                n0v0Var.t(s01Var.b, s01Var.d);
            }
        }
        C(arrayList);
        this.a = 0;
    }

    public void h() {
        ((ven0) this.b).setValue(Boolean.FALSE);
    }

    public void j(s01 s01Var) {
        int i;
        up20 up20Var = (up20) this.b;
        byte b = s01Var.a;
        if (b == 1 || b == 8) {
            hhg1.n("should not dispatch add or move for pre layout");
            return;
        }
        int iG = G(s01Var.b, b);
        int i2 = s01Var.b;
        byte b2 = s01Var.a;
        if (b2 == 2) {
            i = 0;
        } else {
            if (b2 != 4) {
                hhg1.g(s01Var, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i3 = 1;
        for (int i4 = 1; i4 < s01Var.d; i4++) {
            int iG2 = G((i * i4) + s01Var.b, s01Var.a);
            byte b3 = s01Var.a;
            if (b3 == 2 ? iG2 != iG : !(b3 == 4 && iG2 == iG + 1)) {
                s01 s01VarY = y(s01Var.c, b3, iG, i3);
                k(s01VarY, i2);
                s01VarY.c = null;
                up20Var.i(s01VarY);
                if (s01Var.a == 4) {
                    i2 += i3;
                }
                i3 = 1;
                iG = iG2;
            } else {
                i3++;
            }
        }
        Object obj = s01Var.c;
        s01Var.c = null;
        up20Var.i(s01Var);
        if (i3 > 0) {
            s01 s01VarY2 = y(obj, s01Var.a, iG, i3);
            k(s01VarY2, i2);
            s01VarY2.c = null;
            up20Var.i(s01VarY2);
        }
    }

    public void k(s01 s01Var, int i) {
        n0v0 n0v0Var = (n0v0) this.e;
        n0v0Var.p(s01Var);
        byte b = s01Var.a;
        if (b != 2) {
            if (b == 4) {
                n0v0Var.r(i, s01Var.d, s01Var.c);
                return;
            } else {
                hhg1.n("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i2 = s01Var.d;
        RecyclerView recyclerView = (RecyclerView) n0v0Var.b;
        recyclerView.b0(i, i2, true);
        recyclerView.K1 = true;
        recyclerView.H1.c += i2;
    }

    public void l(boolean z) {
        h6q0 h6q0Var = (h6q0) this.d;
        ((ven0) this.b).setValue(Boolean.FALSE);
        ((ven0) this.f).setValue(Boolean.valueOf(!z));
        if (z && ((zkn) this.c).g.containsKey(h6q0Var.a.a)) {
            ((iu30) this.e).invoke(new ukn(this.a, h6q0Var.a));
        }
    }

    public int m(int i) {
        return n(i, 0);
    }

    public int n(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            s01 s01Var = (s01) arrayList.get(i2);
            byte b = s01Var.a;
            int i3 = s01Var.b;
            if (b == 8) {
                if (i3 == i) {
                    i = s01Var.d;
                } else {
                    if (i3 < i) {
                        i--;
                    }
                    if (s01Var.d <= i) {
                        i++;
                    }
                }
            } else if (i3 > i) {
                continue;
            } else if (b == 2) {
                int i4 = s01Var.d;
                if (i < i3 + i4) {
                    return -1;
                }
                i -= i4;
            } else if (b == 1) {
                i += s01Var.d;
            }
            i2++;
        }
        return i;
    }

    public void o(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.e;
        while (priorityQueue.size() > i) {
            re21 re21Var = (re21) priorityQueue.poll();
            String str = zoi1.a;
            int i2 = 0;
            while (true) {
                arrayList = re21Var.a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((se21) this.b).e(re21Var.b, (izr0) arrayList.get(i2));
                ((ArrayDeque) this.c).push((izr0) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            re21 re21Var2 = (re21) this.f;
            if (re21Var2 != null && re21Var2.b == re21Var.b) {
                this.f = null;
            }
            ((ArrayDeque) this.d).push(re21Var);
        }
    }

    public Long p() {
        Long l = (Long) this.e;
        if (l == null) {
            return 0L;
        }
        return l;
    }

    public int q() {
        return this.a;
    }

    public Long r() {
        return (Long) this.c;
    }

    public long s() {
        Long l = (Long) this.b;
        Long l2 = (Long) this.c;
        if (l2 == null) {
            return 0L;
        }
        return l2.longValue() - l.longValue();
    }

    public nql t() {
        return (nql) this.f;
    }

    public n830 u() {
        n830 n830Var = (n830) this.f;
        if (n830Var != null) {
            return n830Var;
        }
        u890.C("viewBinder");
        throw null;
    }

    public boolean v(int i) {
        return (this.a & i) != 0;
    }

    public boolean w() {
        return ((ArrayList) this.c).size() > 0;
    }

    public boolean x() {
        return (((ArrayList) this.d).isEmpty() || ((ArrayList) this.c).isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s01 y(Object obj, int i, int i2, int i3) {
        s01 s01Var = (s01) ((up20) this.b).a();
        if (s01Var != null) {
            s01Var.a = i;
            s01Var.b = i2;
            s01Var.d = i3;
            s01Var.c = obj;
            return s01Var;
        }
        s01 s01Var2 = new s01();
        s01Var2.a = i;
        s01Var2.b = i2;
        s01Var2.d = i3;
        s01Var2.c = obj;
        return s01Var2;
    }

    public void z(String str) {
        ((t8r0) this.d).m(this.a, str);
        vku vkuVar = (vku) this.e;
        Scheduler scheduler = (Scheduler) this.b;
        vkuVar.a(j2h1.D(w0h1.h(scheduler), new puz0(this, str, (lnm) null, (byte) 1)).n(scheduler).subscribe(new ruz0(this, (byte) 0), new quz0(this, (byte) 1)));
    }

    public t01(Scheduler scheduler, kdy0 kdy0Var, t8r0 t8r0Var) {
        this.b = scheduler;
        this.c = kdy0Var;
        this.d = t8r0Var;
        this.e = new vku();
    }

    public t01(Long l, Long l2) {
        UUID uuidRandomUUID = UUID.randomUUID();
        this.b = l;
        this.c = l2;
        this.d = uuidRandomUUID;
    }

    public t01(se21 se21Var) {
        this.b = se21Var;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = new PriorityQueue();
        this.a = -1;
    }

    public t01(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, iw61 iw61Var, Rect rect) {
        o0c.o(rect.left);
        o0c.o(rect.top);
        o0c.o(rect.right);
        o0c.o(rect.bottom);
        this.b = rect;
        this.c = colorStateList2;
        this.d = colorStateList;
        this.e = colorStateList3;
        this.a = i;
        this.f = iw61Var;
    }

    public /* synthetic */ t01(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.a = i;
    }

    public t01(Object obj, Looper looper, Looper looper2, rdd1 rdd1Var, io00 io00Var) {
        this.b = rdd1Var.a(looper, (Handler.Callback) null);
        this.c = rdd1Var.a(looper2, (Handler.Callback) null);
        this.e = obj;
        this.f = obj;
        this.d = io00Var;
    }

    public t01(ven0 ven0Var, zkn zknVar, h6q0 h6q0Var, iu30 iu30Var, int i, ven0 ven0Var2) {
        this.b = ven0Var;
        this.c = zknVar;
        this.d = h6q0Var;
        this.e = iu30Var;
        this.a = i;
        this.f = ven0Var2;
    }
}
