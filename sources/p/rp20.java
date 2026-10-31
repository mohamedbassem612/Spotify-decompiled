package p;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface rp20 {
    int b(int i, int i2, int i3);

    View c(int i);

    int d(int i, int i2, int i3);

    void e(View view, int i);

    int f(View view);

    View g(int i);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    void h(View view, int i, int i2, tp20 tp20Var);

    int i(View view, int i, int i2);

    void j(tp20 tp20Var);

    boolean k();

    void setFlexLines(List list);
}
