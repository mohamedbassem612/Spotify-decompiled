package p;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.util.Pair;
import android.view.ContentInfo;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ful {
    public final eul a;

    public ful(eul eulVar) {
        this.a = eulVar;
    }

    public static ClipData a(ClipDescription clipDescription, ArrayList arrayList) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), (ClipData.Item) arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++) {
            clipData.addItem((ClipData.Item) arrayList.get(i));
        }
        return clipData;
    }

    public final Pair b(pmv0 pmv0Var) {
        cul rclVar;
        cul rclVar2;
        eul eulVar = this.a;
        ClipData clipDataE = eulVar.e();
        if (clipDataE.getItemCount() == 1) {
            boolean zB = pmv0Var.b(clipDataE.getItemAt(0));
            ful fulVar = zB ? this : null;
            if (zB) {
                this = null;
            }
            return Pair.create(fulVar, this);
        }
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < clipDataE.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataE.getItemAt(i);
            if (pmv0Var.b(itemAt)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(itemAt);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(itemAt);
            }
        }
        Pair pairCreate = arrayList == null ? Pair.create(null, clipDataE) : arrayList2 == null ? Pair.create(clipDataE, null) : Pair.create(a(clipDataE.getDescription(), arrayList), a(clipDataE.getDescription(), arrayList2));
        if (pairCreate.first == null) {
            return Pair.create(null, this);
        }
        if (pairCreate.second == null) {
            return Pair.create(this, null);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            rclVar = new rcl(this);
        } else {
            dul dulVar = new dul();
            dulVar.b = eulVar.e();
            dulVar.c = eulVar.getSource();
            dulVar.d = eulVar.getFlags();
            dulVar.e = eulVar.b();
            dulVar.f = eulVar.getExtras();
            rclVar = dulVar;
        }
        rclVar.c((ClipData) pairCreate.first);
        ful fulVarBuild = rclVar.build();
        if (i2 >= 31) {
            rclVar2 = new rcl(this);
        } else {
            dul dulVar2 = new dul();
            dulVar2.b = eulVar.e();
            dulVar2.c = eulVar.getSource();
            dulVar2.d = eulVar.getFlags();
            dulVar2.e = eulVar.b();
            dulVar2.f = eulVar.getExtras();
            rclVar2 = dulVar2;
        }
        rclVar2.c((ClipData) pairCreate.second);
        return Pair.create(fulVarBuild, rclVar2.build());
    }

    public final ContentInfo c() {
        ContentInfo contentInfoD = this.a.d();
        Objects.requireNonNull(contentInfoD);
        return contentInfoD;
    }

    public final String toString() {
        return this.a.toString();
    }
}
