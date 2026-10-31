package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qg0 extends vnn0 {
    public Intent Y;
    public String Z;

    @Override // p.vnn0
    public final boolean equals(Object obj) {
        boolean zFilterEquals;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof qg0) && super.equals(obj)) {
            Intent intent = this.Y;
            if (intent != null) {
                zFilterEquals = intent.filterEquals(((qg0) obj).Y);
            } else {
                zFilterEquals = ((qg0) obj).Y == null;
            }
            if (zFilterEquals && u890.j(this.Z, ((qg0) obj).Z)) {
                return true;
            }
        }
        return false;
    }

    @Override // p.vnn0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        Intent intent = this.Y;
        int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
        String str = this.Z;
        return iFilterHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p.vnn0
    public final void k(Context context, AttributeSet attributeSet) {
        super.k(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, cmz0.a);
        String string = typedArrayObtainAttributes.getString(4);
        String strW = string != null ? nhc1.W(string, "${applicationId}", context.getPackageName()) : null;
        Intent intent = this.Y;
        if (intent == null) {
            intent = new Intent();
            this.Y = intent;
        }
        intent.setPackage(strW);
        String string2 = typedArrayObtainAttributes.getString(0);
        if (string2 != null) {
            if (string2.charAt(0) == '.') {
                string2 = context.getPackageName() + string2;
            }
            ComponentName componentName = new ComponentName(context, string2);
            Intent intent2 = this.Y;
            if (intent2 == null) {
                intent2 = new Intent();
                this.Y = intent2;
            }
            intent2.setComponent(componentName);
        }
        String string3 = typedArrayObtainAttributes.getString(1);
        Intent intent3 = this.Y;
        if (intent3 == null) {
            intent3 = new Intent();
            this.Y = intent3;
        }
        intent3.setAction(string3);
        String string4 = typedArrayObtainAttributes.getString(2);
        String strW2 = string4 != null ? nhc1.W(string4, "${applicationId}", context.getPackageName()) : null;
        if (strW2 != null) {
            Uri uri = Uri.parse(strW2);
            Intent intent4 = this.Y;
            if (intent4 == null) {
                intent4 = new Intent();
                this.Y = intent4;
            }
            intent4.setData(uri);
        }
        String string5 = typedArrayObtainAttributes.getString(3);
        this.Z = string5 != null ? nhc1.W(string5, "${applicationId}", context.getPackageName()) : null;
        typedArrayObtainAttributes.recycle();
    }

    @Override // p.vnn0
    public final String toString() {
        Intent intent = this.Y;
        ComponentName component = intent != null ? intent.getComponent() : null;
        StringBuilder sb = new StringBuilder(super.toString());
        if (component != null) {
            sb.append(" class=");
            sb.append(component.getClassName());
        } else {
            Intent intent2 = this.Y;
            String action = intent2 != null ? intent2.getAction() : null;
            if (action != null) {
                sb.append(" action=");
                sb.append(action);
            }
        }
        return sb.toString();
    }
}
