package p;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.comscore.streaming.AdvertisementType;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k3i0 implements saw0 {
    public final Object a;
    public final Object b;
    public final Object c;

    public k3i0(zxa zxaVar, gw70 gw70Var) {
        this.a = zxaVar;
        this.b = gw70Var;
        this.c = new Paint(1);
    }

    public static ArrayList d(Cursor cursor, Uri uri, p8i0 p8i0Var) {
        int i;
        int i2;
        Object next;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("date_added");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("width");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("height");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("mime_type");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("_size");
        int columnIndexOrThrow7 = p8i0Var == p8i0.VIDEO ? cursor.getColumnIndexOrThrow("duration") : -1;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(columnIndexOrThrow);
            Uri uriWithAppendedId = ContentUris.withAppendedId(uri, j);
            long j2 = cursor.getLong(columnIndexOrThrow2);
            int i3 = cursor.getInt(columnIndexOrThrow3);
            int i4 = cursor.getInt(columnIndexOrThrow4);
            int i5 = columnIndexOrThrow;
            String string = cursor.getString(columnIndexOrThrow5);
            Iterator it = p8i0.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = columnIndexOrThrow2;
                    i2 = columnIndexOrThrow3;
                    next = null;
                    break;
                }
                next = it.next();
                i = columnIndexOrThrow2;
                p8i0 p8i0Var2 = (p8i0) next;
                if (string != null) {
                    i2 = columnIndexOrThrow3;
                    if (nhc1.Y(string, p8i0Var2.a, false)) {
                        break;
                    }
                } else {
                    i2 = columnIndexOrThrow3;
                }
                columnIndexOrThrow2 = i;
                columnIndexOrThrow3 = i2;
            }
            p8i0 p8i0Var3 = (p8i0) next;
            if (p8i0Var3 == null) {
                p8i0Var3 = p8i0.IMAGE;
            }
            arrayList.add(new xoh0(j, uriWithAppendedId, j2, i3, i4, p8i0Var3, cursor.getLong(columnIndexOrThrow6), columnIndexOrThrow7 >= 0 ? cursor.getLong(columnIndexOrThrow7) : 0L));
            columnIndexOrThrow = i5;
            columnIndexOrThrow2 = i;
            columnIndexOrThrow3 = i2;
        }
        return arrayList;
    }

    public static Bitmap f(Bitmap bitmap, Bitmap bitmap2, int i) {
        mmr0 mmr0Var;
        Bitmap.Config config;
        int i2;
        int i3;
        int i4;
        int i5;
        if (bitmap2 == null) {
            return bitmap;
        }
        int height = bitmap2.getHeight();
        int width = bitmap2.getWidth();
        tr80 tr80VarQ = yoi1.Q(0, height);
        tr80 tr80VarQ2 = yoi1.Q(0, width);
        Rect rect = new Rect(-1, -1, -1, -1);
        int i6 = ((rr80) tr80VarQ).a;
        int i7 = ((rr80) tr80VarQ).b;
        if (i6 <= i7) {
            int i8 = i6;
            while (rect.top == -1) {
                int i9 = ((rr80) tr80VarQ2).a;
                int i10 = ((rr80) tr80VarQ2).b;
                if (i9 <= i10) {
                    while (true) {
                        if (bitmap2.getPixel(i9, i8) != 0) {
                            int i11 = i8 - 1;
                            if (i11 < 0) {
                                i11 = 0;
                            }
                            rect.top = i11;
                            break;
                        }
                        if (i9 == i10) {
                            break;
                        }
                        i9++;
                    }
                }
                if (i8 == i7) {
                    break;
                }
                i8++;
            }
        }
        for (int i12 = height - 1; -1 < i12 && rect.bottom == -1; i12--) {
            int i13 = ((rr80) tr80VarQ2).a;
            int i14 = ((rr80) tr80VarQ2).b;
            if (i13 <= i14) {
                while (true) {
                    if (bitmap2.getPixel(i13, i12) != 0) {
                        int i15 = i12 - 1;
                        if (i15 < 0) {
                            i15 = 0;
                        }
                        rect.bottom = i15;
                        break;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13++;
                }
            }
        }
        int i16 = ((rr80) tr80VarQ2).a;
        int i17 = ((rr80) tr80VarQ2).b;
        if (i16 <= i17) {
            while (rect.left == -1) {
                if (i6 <= i7) {
                    int i18 = i6;
                    while (true) {
                        if (bitmap2.getPixel(i16, i18) != 0) {
                            int i19 = i16 - 1;
                            if (i19 < 0) {
                                i19 = 0;
                            }
                            rect.left = i19;
                            break;
                        }
                        if (i18 == i7) {
                            break;
                        }
                        i18++;
                    }
                }
                if (i16 == i17) {
                    break;
                }
                i16++;
            }
        }
        for (int i20 = width - 1; -1 < i20 && rect.right == -1; i20--) {
            if (i6 <= i7) {
                int i21 = i6;
                while (true) {
                    if (bitmap2.getPixel(i20, i21) != 0) {
                        int i22 = i20 - 1;
                        if (i22 < 0) {
                            i22 = 0;
                        }
                        rect.right = i22;
                        break;
                    }
                    if (i21 == i7) {
                        break;
                    }
                    i21++;
                }
            }
        }
        int i23 = rect.top;
        if (i6 <= i23 && i23 <= i7 && i6 <= (i2 = rect.bottom) && i2 <= i7 && (i3 = ((rr80) tr80VarQ2).a) <= (i4 = rect.left) && i4 <= i17 && i3 <= (i5 = rect.right) && i5 <= i17) {
            int i24 = height - (i23 * 2);
            int i25 = (i5 - (width - (i4 * 2))) - i4;
            if (i25 < 0) {
                i25 = 0;
            }
            int i26 = (i2 - i24) - i23;
            int i27 = i4 - i25;
            int i28 = i23 - (i26 >= 0 ? i26 : 0);
            bitmap2 = Bitmap.createBitmap(bitmap2, i27, i28, width - (i27 * 2), height - (i28 * 2));
        }
        if (!bitmap.isMutable()) {
            if ((Build.VERSION.SDK_INT < 26 || bitmap.getConfig() != Bitmap.Config.HARDWARE) && bitmap.getConfig() != null) {
                config = bitmap.getConfig();
                config.getClass();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            bitmap = bitmap.copy(config, true);
        }
        Canvas canvas = new Canvas(bitmap);
        float width2 = bitmap.getWidth();
        float width3 = bitmap2.getWidth() / bitmap2.getHeight();
        if (bitmap2.getWidth() > bitmap2.getHeight()) {
            float f = width2 - (i * 2);
            mmr0Var = new mmr0(Float.valueOf(f), Float.valueOf(f / width3));
        } else {
            float f2 = width2 - (i * 2);
            mmr0Var = new mmr0(Float.valueOf(width3 * f2), Float.valueOf(f2));
        }
        float fFloatValue = ((Number) mmr0Var.a).floatValue();
        float fFloatValue2 = ((Number) mmr0Var.b).floatValue();
        int width4 = (int) ((canvas.getWidth() - fFloatValue) / 2.0f);
        int height2 = (int) ((canvas.getHeight() - fFloatValue2) / 2.0f);
        canvas.drawBitmap(bitmap2, (Rect) null, new Rect(width4, height2, (int) (width4 + fFloatValue), (int) (height2 + fFloatValue2)), (Paint) null);
        return bitmap;
    }

    public int b(boolean z) {
        int i = Build.VERSION.SDK_INT;
        Context context = (Context) this.a;
        if (i < 33) {
            return x74.j(context, "android.permission.READ_EXTERNAL_STORAGE") == 0 ? 1 : 3;
        }
        boolean z2 = x74.j(context, "android.permission.READ_MEDIA_IMAGES") == 0;
        boolean z3 = !z || x74.j(context, "android.permission.READ_MEDIA_VIDEO") == 0;
        if (z2 && z3) {
            return 1;
        }
        return (i < 34 || x74.j(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") != 0) ? 3 : 2;
    }

    public Notification c() {
        Context context = (Context) this.a;
        NotificationManager notificationManager = (NotificationManager) this.c;
        if (Build.VERSION.SDK_INT >= 26 && notificationManager.getNotificationChannel("spotify_widget_updates_channel") == null) {
            wu7.m();
            notificationManager.createNotificationChannel(new NotificationChannel("spotify_widget_updates_channel", context.getString(2131963868), 2));
        }
        dko0 dko0Var = new dko0(context, "spotify_widget_updates_channel");
        dko0Var.g = (PendingIntent) ((xs80) this.b).d.getValue();
        Notification notification = dko0Var.D;
        notification.icon = 2131233418;
        dko0Var.j(context.getString(2131963869));
        dko0Var.v = 1;
        notification.vibrate = new long[]{0};
        dko0Var.l(2, false);
        dko0Var.j = -1;
        dko0Var.u = context.getColor(2131104474);
        dko0Var.r(new jko0());
        return dko0Var.c();
    }

    public Cursor e(Uri uri, String[] strArr, int i) {
        Bundle bundle = new Bundle();
        bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_added"});
        bundle.putInt("android:query-arg-sort-direction", 1);
        bundle.putInt("android:query-arg-limit", AdvertisementType.OTHER);
        bundle.putInt("android:query-arg-offset", i);
        return ((ContentResolver) this.c).query(uri, strArr, bundle, null);
    }

    public k3i0(Context context, xs80 xs80Var, NotificationManager notificationManager) {
        this.a = context;
        this.b = xs80Var;
        this.c = notificationManager;
    }

    public k3i0(Context context, q8n q8nVar) {
        this.a = context;
        this.b = q8nVar;
        this.c = context.getContentResolver();
    }
}
