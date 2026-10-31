package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class w9d1 extends dn90 {
    public final int e;
    public final Paint f = new Paint();
    public final boolean g;
    public final LinkedHashMap h;

    public w9d1(Context context) {
        this.e = context.getResources().getDimensionPixelSize(2131167111);
        this.g = context.getResources().getConfiguration().getLayoutDirection() == 1;
        this.h = new LinkedHashMap();
    }

    public static qad1 m(w611 w611Var) {
        Object tag = w611Var.a.getTag(2131429147);
        Object tag2 = w611Var.a.getTag(2131431182);
        if (w611Var instanceof qad1) {
            return (qad1) w611Var;
        }
        if (tag instanceof qad1) {
            return (qad1) tag;
        }
        if (tag2 instanceof qad1) {
            return (qad1) tag2;
        }
        return null;
    }

    @Override // p.dn90
    public final int e(w611 w611Var) {
        qad1 qad1VarM = m(w611Var);
        int i = 0;
        if (qad1VarM != null) {
            m9d1 m9d1VarB = qad1VarM.b();
            boolean z = this.g;
            if (m9d1VarB != null) {
                i = z ? 4 : 8;
            }
            if (qad1VarM.a() != null) {
                i |= z ? 8 : 4;
            }
        }
        return (i << 8) | i;
    }

    @Override // p.dn90
    public final void i(Canvas canvas, RecyclerView recyclerView, w611 w611Var, float f, float f2, int i, boolean z) {
        m9d1 m9d1VarB;
        View view = w611Var.a;
        float width = view.getWidth() * 0.45f;
        float fO = yoi1.o(f, -width, width);
        qad1 qad1VarM = m(w611Var);
        if (qad1VarM != null) {
            int iHashCode = view.hashCode();
            LinkedHashMap linkedHashMap = this.h;
            if (fO == 0.0f) {
                m9d1 m9d1Var = (m9d1) linkedHashMap.remove(Integer.valueOf(iHashCode));
                if (m9d1Var != null) {
                    m9d1Var.c.invoke();
                }
            } else {
                int height = view.getHeight();
                int i2 = this.e;
                int i3 = (height - i2) / 2;
                Rect rect = fO < 0.0f ? new Rect(view.getRight() + ((int) fO), view.getTop(), view.getRight(), view.getBottom()) : new Rect(view.getLeft(), view.getTop(), view.getLeft() + ((int) fO), view.getBottom());
                int i4 = rect.left + rect.right;
                Rect rect2 = new Rect((i4 - i2) / 2, rect.top + i3, (i4 + i2) / 2, rect.bottom - i3);
                boolean z2 = this.g;
                if (!z2 && fO > 0) {
                    m9d1VarB = qad1VarM.b();
                } else if (!z2 && fO < 0.0f) {
                    m9d1VarB = qad1VarM.a();
                } else if (!z2 || fO <= r7) {
                    m9d1VarB = (!z2 || fO >= 0.0f) ? null : qad1VarM.b();
                } else {
                    m9d1VarB = qad1VarM.a();
                }
                if (m9d1VarB != null) {
                    float fAbs = Math.abs(fO) / view.getWidth();
                    int i5 = m9d1VarB.a;
                    Paint paint = this.f;
                    paint.setColor(i5);
                    float f3 = fAbs / 0.25f;
                    paint.setAlpha(jch0.U(f3 * 255.0f));
                    canvas.clipRect(rect);
                    canvas.drawRect(rect, paint);
                    ads adsVar = m9d1VarB.b;
                    adsVar.setBounds(rect2);
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    int i6 = (int) (255.0f * f3);
                    ((Drawable) adsVar.b).setAlpha(i6);
                    Drawable drawable = (Drawable) adsVar.c;
                    if (drawable != null) {
                        drawable.setAlpha(255 - i6);
                    }
                    adsVar.draw(canvas);
                    boolean zContainsKey = linkedHashMap.containsKey(Integer.valueOf(iHashCode));
                    if (fAbs > 0.25f) {
                        if (z && !zContainsKey) {
                            linkedHashMap.put(Integer.valueOf(iHashCode), m9d1VarB);
                            if (Build.VERSION.SDK_INT >= 34) {
                                view.performHapticFeedback(23);
                            } else {
                                view.performHapticFeedback(1);
                            }
                        }
                    } else if (z && zContainsKey) {
                        linkedHashMap.remove(Integer.valueOf(iHashCode));
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 34) {
                            view.performHapticFeedback(24);
                        } else if (i7 >= 27) {
                            view.performHapticFeedback(8);
                        } else {
                            view.performHapticFeedback(1);
                        }
                    }
                }
            }
        }
        super.i(canvas, recyclerView, w611Var, fO, f2, i, z);
    }
}
