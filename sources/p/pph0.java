package p;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaConstants;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pph0 implements hx30 {
    public final /* synthetic */ ixh0 a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ hsk c;
    public final /* synthetic */ tph0 d;

    public pph0(tph0 tph0Var, ixh0 ixh0Var, AtomicReference atomicReference, hsk hskVar) {
        this.d = tph0Var;
        this.a = ixh0Var;
        this.b = atomicReference;
        this.c = hskVar;
    }

    public final void onFailure(Throwable th) {
        oon1.w("Couldn't get a result from onGetLibraryRoot", th);
        this.b.set(bai0.a);
        this.c.f();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    public final void onSuccess(Object obj) {
        MediaBrowserServiceCompat.BrowserRoot browserRoot;
        Bundle bundle;
        s7c0 s7c0Var = (s7c0) obj;
        AtomicReference atomicReference = this.b;
        if (s7c0Var != null) {
            Object obj2 = s7c0Var.c;
            if (s7c0Var.a != 0 || obj2 == null) {
                if (s7c0Var != null || s7c0Var.a == 0) {
                    browserRoot = bai0.a;
                } else {
                    browserRoot = null;
                }
                atomicReference.set(browserRoot);
            } else {
                iph0 iph0Var = s7c0Var.e;
                if (iph0Var != null) {
                    int i = yzb0.a;
                    Bundle bundle2 = iph0Var.a;
                    bundle = new Bundle(bundle2);
                    if (bundle2.containsKey("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY")) {
                        boolean z = bundle2.getBoolean("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY", false);
                        bundle.remove("androidx.media3.session.LibraryParams.Extras.KEY_ROOT_CHILDREN_BROWSABLE_ONLY");
                        bundle.putInt(MediaConstants.BROWSER_ROOT_HINTS_KEY_ROOT_CHILDREN_SUPPORTED_FLAGS, z ? 1 : 3);
                    }
                    bundle.putBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_RECENT, iph0Var.b);
                    bundle.putBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_OFFLINE, iph0Var.c);
                    bundle.putBoolean(MediaBrowserServiceCompat.BrowserRoot.EXTRA_SUGGESTED, iph0Var.d);
                } else {
                    bundle = new Bundle();
                }
                tph0 tph0Var = this.d;
                bundle.putBoolean(MediaConstants.BROWSER_SERVICE_EXTRAS_KEY_SEARCH_SUPPORTED, tph0Var.c.w(this.a, 50005));
                iqh0 iqh0Var = tph0Var.d;
                iqh0Var.C();
                b380 b380Var = iqh0Var.r;
                if (!b380Var.isEmpty()) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (int i2 = 0; i2 < b380Var.size(); i2++) {
                        udh udhVar = (udh) b380Var.get(i2);
                        pa61 pa61Var = udhVar.a;
                        if (pa61Var != null && pa61Var.a == 0) {
                            int i3 = yzb0.a;
                            Bundle bundle3 = new Bundle();
                            pa61 pa61Var2 = udhVar.a;
                            Bundle bundle4 = udhVar.g;
                            if (pa61Var2 != null) {
                                bundle3.putString(MediaConstants.EXTRAS_KEY_CUSTOM_BROWSER_ACTION_ID, pa61Var2.b);
                            }
                            bundle3.putString(MediaConstants.EXTRAS_KEY_CUSTOM_BROWSER_ACTION_LABEL, udhVar.f.toString());
                            Uri uri = udhVar.e;
                            if (uri != null) {
                                bundle3.putString(MediaConstants.EXTRAS_KEY_CUSTOM_BROWSER_ACTION_ICON_URI, uri.toString());
                            }
                            if (!bundle4.isEmpty()) {
                                bundle3.putBundle(MediaConstants.EXTRAS_KEY_CUSTOM_BROWSER_ACTION_EXTRAS, bundle4);
                            }
                            arrayList.add(bundle3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        bundle.putParcelableArrayList(MediaConstants.BROWSER_SERVICE_EXTRAS_KEY_CUSTOM_BROWSER_ACTION_ROOT_LIST, arrayList);
                    }
                }
                atomicReference.set(new MediaBrowserServiceCompat.BrowserRoot(((yoh0) obj2).a, bundle));
            }
        } else {
            if (s7c0Var != null) {
                browserRoot = bai0.a;
            } else {
                browserRoot = bai0.a;
            }
            atomicReference.set(browserRoot);
        }
        this.c.f();
    }
}
