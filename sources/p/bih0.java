package p;

import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bih0 extends gih0 {
    public final /* synthetic */ byte e = 0;
    public final /* synthetic */ ruc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bih0(String str, ruc0 ruc0Var) {
        super(str);
        this.f = ruc0Var;
    }

    @Override // p.gih0
    public final void a() {
        byte b = this.e;
        ruc0 ruc0Var = this.f;
        switch (b) {
            case 0:
                ((MediaBrowserService.Result) ruc0Var.b).detach();
                break;
            default:
                ((MediaBrowserService.Result) ruc0Var.b).detach();
                break;
        }
    }

    @Override // p.gih0
    public final void c(Object obj) {
        byte b = this.e;
        ArrayList arrayList = null;
        ruc0 ruc0Var = this.f;
        switch (b) {
            case 0:
                List<MediaBrowserCompat$MediaItem> list = (List) obj;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem : list) {
                        Parcel parcelObtain = Parcel.obtain();
                        mediaBrowserCompat$MediaItem.writeToParcel(parcelObtain, 0);
                        arrayList.add(parcelObtain);
                    }
                }
                ruc0Var.f(arrayList);
                break;
            default:
                List<MediaBrowserCompat$MediaItem> list2 = (List) obj;
                if (list2 == null) {
                    ruc0Var.f((Object) null);
                } else {
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem2 : list2) {
                        Parcel parcelObtain2 = Parcel.obtain();
                        mediaBrowserCompat$MediaItem2.writeToParcel(parcelObtain2, 0);
                        arrayList2.add(parcelObtain2);
                    }
                    ruc0Var.f(arrayList2);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bih0(eih0 eih0Var, String str, ruc0 ruc0Var, Bundle bundle) {
        super(str);
        this.f = ruc0Var;
    }
}
