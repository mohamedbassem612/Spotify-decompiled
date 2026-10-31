package androidx.car.app;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.car.app.CarAppPermissionActivity;
import androidx.car.app.IOnRequestPermissionsListener;
import app.p000rive.semantics.SemanticState;
import java.util.ArrayList;
import java.util.Map;
import p.bh0;
import p.e1r0;
import p.g0i;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class CarAppPermissionActivity extends g0i {
    public static final /* synthetic */ int U0 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Bundle bundle2 = getPackageManager().getApplicationInfo(getPackageName(), SemanticState.Focused).metaData;
            int i = bundle2 != null ? bundle2.getInt("androidx.car.app.theme") : 0;
            Context contextCreateConfigurationContext = createConfigurationContext(getResources().getConfiguration());
            if (i != 0) {
                contextCreateConfigurationContext.setTheme(i);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier("carPermissionActivityLayout", "attr", getPackageName());
            if (identifier != 0) {
                int resourceId = contextCreateConfigurationContext.getTheme().obtainStyledAttributes(new int[]{identifier}).getResourceId(0, 0);
                if (resourceId != 0) {
                    setContentView(resourceId);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Intent intent = getIntent();
        if (intent == null || !"androidx.car.app.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            if (intent != null) {
                intent.getAction();
            }
            finish();
            return;
        }
        Bundle extras = intent.getExtras();
        final IOnRequestPermissionsListener iOnRequestPermissionsListenerAsInterface = IOnRequestPermissionsListener.Stub.asInterface(extras.getBinder("androidx.car.app.action.EXTRA_ON_REQUEST_PERMISSIONS_RESULT_LISTENER_KEY"));
        String[] stringArray = extras.getStringArray("androidx.car.app.action.EXTRA_PERMISSIONS_KEY");
        if (iOnRequestPermissionsListenerAsInterface == null || stringArray == null) {
            finish();
        } else {
            a0(new bh0() { // from class: p.cpd
                public final void a(Object obj) {
                    IOnRequestPermissionsListener iOnRequestPermissionsListener = iOnRequestPermissionsListenerAsInterface;
                    int i2 = CarAppPermissionActivity.U0;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : ((Map) obj).entrySet()) {
                        Boolean bool = (Boolean) entry.getValue();
                        if (bool == null || !bool.booleanValue()) {
                            arrayList2.add((String) entry.getKey());
                        } else {
                            arrayList.add((String) entry.getKey());
                        }
                    }
                    try {
                        iOnRequestPermissionsListener.onRequestPermissionsResult((String[]) arrayList.toArray(new String[0]), (String[]) arrayList2.toArray(new String[0]));
                    } catch (RemoteException unused2) {
                    }
                    this.a.finish();
                }
            }, new e1r0((byte) 3, false)).a(stringArray);
        }
    }
}
