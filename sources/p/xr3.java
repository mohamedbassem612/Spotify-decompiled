package p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.spotify.encoreconsumermobile.elements.entityaction.EntityActionView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xr3 extends LinearLayout implements fcy {
    public final int a;
    public final Space b;
    public final ArrayList c;
    public final EntityActionView d;
    public final q4u e;

    public xr3(Context context) {
        super(context, null, 0);
        this.a = getResources().getDimensionPixelSize(2131165951);
        Space space = new Space(context);
        space.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.b = space;
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            EntityActionView entityActionView = new EntityActionView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            int i2 = this.a;
            entityActionView.setLayoutParams(new LinearLayout.LayoutParams(i2, i2));
            arrayList.add(entityActionView);
        }
        this.c = arrayList;
        EntityActionView entityActionView2 = new EntityActionView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        int i3 = this.a;
        entityActionView2.setLayoutParams(new LinearLayout.LayoutParams(i3, i3));
        this.d = entityActionView2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(0);
        setGravity(16);
        addView(this.b);
        Iterator it = o7h.T0(arrayList).iterator();
        while (it.hasNext()) {
            addView((View) it.next());
        }
        addView(this.d);
        EntityActionView entityActionView3 = this.d;
        post(new wr3(entityActionView3, entityActionView3.getContext().getResources().getDimensionPixelSize(2131166820), this, (byte) 0));
        this.e = nln.w(new q4u[]{nln.x(ur3.b, nln.v(new n5(1, this, xr3.class, "renderPrimaryAction", "renderPrimaryAction(Lcom/spotify/encoreconsumermobile/elements/entityaction/EntityAction$Model;)V", 0, (byte) 8))), nln.x(vr3.b, nln.v(new n5(1, this, xr3.class, "renderActions", "renderActions(Ljava/util/List;)V", 0, (byte) 9))), nln.v(new n5(1, this, xr3.class, "renderContentDescription", "renderContentDescription(Lcom/spotify/encoreconsumermobile/elements/entityactionrow/EntityActionRow$Model;)V", 0, (byte) 10))});
    }

    public final void f(Object obj) {
        this.e.a((ecy) obj);
    }

    public final void n(iu30 iu30Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((EntityActionView) it.next()).n(iu30Var);
        }
        this.d.n(iu30Var);
    }
}
