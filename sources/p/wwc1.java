package p;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import app.p000rive.semantics.SemanticState;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wwc1 extends moo implements View.OnClickListener {
    public static final /* synthetic */ int X0 = 0;
    public final WeakHashMap N0;
    public final int O0;
    public int P0;
    public ColorStateList Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public int W0;
    public final SearchView X;
    public final SearchableInfo Y;
    public final Context Z;
    public final int h;
    public final int i;
    public final LayoutInflater t;

    public wwc1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.b = true;
        this.c = null;
        this.a = false;
        this.d = -1;
        this.e = new koo(this);
        this.f = new loo(this, (byte) 0);
        this.i = suggestionRowLayout;
        this.h = suggestionRowLayout;
        this.t = (LayoutInflater) context.getSystemService("layout_inflater");
        this.P0 = 1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.X = searchView;
        this.Y = searchableInfo;
        this.O0 = searchView.getSuggestionCommitIconResId();
        this.Z = context;
        this.N0 = weakHashMap;
    }

    public static String i(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p.moo
    public final void a(View view, Cursor cursor) {
        int i;
        Drawable drawableG;
        CharSequence charSequenceI;
        vwc1 vwc1Var = (vwc1) view.getTag();
        int i2 = this.W0;
        int i3 = i2 != -1 ? cursor.getInt(i2) : 0;
        TextView textView = vwc1Var.a;
        TextView textView2 = vwc1Var.b;
        ImageView imageView = vwc1Var.e;
        if (textView != null) {
            String strI = i(cursor, this.R0);
            textView.setText(strI);
            if (TextUtils.isEmpty(strI)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.Z;
        if (textView2 != null) {
            String strI2 = i(cursor, this.T0);
            if (strI2 != null) {
                if (this.Q0 == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(2130970421, typedValue, true);
                    this.Q0 = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strI2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.Q0, null), 0, strI2.length(), 33);
                charSequenceI = spannableString;
            } else {
                charSequenceI = i(cursor, this.S0);
            }
            if (TextUtils.isEmpty(charSequenceI)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(charSequenceI);
            if (TextUtils.isEmpty(charSequenceI)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = vwc1Var.c;
        if (imageView2 != null) {
            int i4 = this.U0;
            if (i4 == -1) {
                drawableG = null;
            } else {
                drawableG = g(cursor.getString(i4));
                if (drawableG == null) {
                    ComponentName searchActivity = this.Y.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.N0;
                    if (weakHashMap.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(strFlattenToShortString);
                        drawableG = constantState == null ? null : constantState.newDrawable(context.getResources());
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, SemanticState.Focused);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    searchActivity.flattenToShortString();
                                    drawableG = null;
                                } else {
                                    drawableG = drawable;
                                }
                            } else {
                                drawableG = null;
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            e.toString();
                        }
                        weakHashMap.put(strFlattenToShortString, drawableG == null ? null : drawableG.getConstantState());
                    }
                    if (drawableG == null) {
                        drawableG = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawableG);
            if (drawableG == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawableG.setVisible(false, false);
                drawableG.setVisible(true, false);
            }
        }
        ImageView imageView3 = vwc1Var.d;
        if (imageView3 == null) {
            i = 1;
        } else {
            int i5 = this.V0;
            Drawable drawableG2 = i5 == -1 ? null : g(cursor.getString(i5));
            imageView3.setImageDrawable(drawableG2);
            if (drawableG2 == null) {
                imageView3.setVisibility(8);
                i = 1;
            } else {
                imageView3.setVisibility(0);
                drawableG2.setVisible(false, false);
                i = 1;
                drawableG2.setVisible(true, false);
            }
        }
        int i6 = this.P0;
        if (i6 != 2 && (i6 != i || (i3 & 1) == 0)) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // p.moo
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.R0 = cursor.getColumnIndex("suggest_text_1");
                this.S0 = cursor.getColumnIndex("suggest_text_2");
                this.T0 = cursor.getColumnIndex("suggest_text_2_url");
                this.U0 = cursor.getColumnIndex("suggest_icon_1");
                this.V0 = cursor.getColumnIndex("suggest_icon_2");
                this.W0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // p.moo
    public final String c(Cursor cursor) {
        String strI;
        String strI2;
        if (cursor == null) {
            return null;
        }
        String strI3 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strI3 != null) {
            return strI3;
        }
        SearchableInfo searchableInfo = this.Y;
        if (searchableInfo.shouldRewriteQueryFromData() && (strI2 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strI2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strI = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strI;
    }

    @Override // p.moo
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.t.inflate(this.h, viewGroup, false);
        viewInflate.setTag(new vwc1(viewInflate));
        ((ImageView) viewInflate.findViewById(2131428583)).setImageResource(this.O0);
        return viewInflate;
    }

    public final Drawable f(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(h4b1.d(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.Z.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(h4b1.d(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(h4b1.d(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(h4b1.d(uri, "More than two path segments: "));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(h4b1.d(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(h4b1.d(uri, "No package found for authority: "));
        }
    }

    public final Drawable g(String str) {
        WeakHashMap weakHashMap = this.N0;
        Context context = this.Z;
        Drawable drawableF = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawable = context.getDrawable(i);
                if (drawable != null) {
                    weakHashMap.put(str2, drawable.getConstantState());
                }
                return drawable;
            } catch (Resources.NotFoundException unused) {
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableF = f(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused4) {
                                uri.toString();
                            }
                            drawableF = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused5) {
                                uri.toString();
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e) {
                    Objects.toString(uri);
                    e.getMessage();
                }
                if (drawableF != null) {
                    weakHashMap.put(str, drawableF.getConstantState());
                }
            }
        }
        return drawableF;
    }

    @Override // p.moo, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewInflate = this.t.inflate(this.i, viewGroup, false);
            if (viewInflate != null) {
                ((vwc1) viewInflate.getTag()).a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // p.moo, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewD = d(viewGroup);
            ((vwc1) viewD.getTag()).a.setText(e.toString());
            return viewD;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.Z.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.X.q((CharSequence) tag);
        }
    }
}
